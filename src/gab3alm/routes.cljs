(ns gab3alm.routes
  (:import goog.history.Html5History)
  (:require [secretary.core :as secretary :refer-macros [defroute]]
            [goog.events :as events]
            [goog.history.EventType :as EventType]
            [reagent.core :refer [atom]]
            [gab3alm.views.template :refer [main-view]]
            [gab3alm.views.resume :refer [resume-view]]
            [gab3alm.views.article :refer [article-view]]
            [gab3alm.views.projects :refer [projects-view]]))

(defonce app-state (atom {}))

(defn hook-browser-navigation! []
  "Enabling browser history"
  (doto (Html5History.)
    (events/listen
      EventType/NAVIGATE
      (fn [event]
        (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn app-routes []
  (secretary/set-config! :prefix "#")
  (defroute "/" []
            (swap! app-state assoc :page :home))
  (defroute "/resume" []
            (swap! app-state assoc :page :resume))
  (defroute "/projects" []
            (swap! app-state assoc :page :projects))
  (defroute "/article/:title" {:as params}
            (swap! app-state assoc :page :article :params params))
  (hook-browser-navigation!))

(defmulti current-page #(@app-state :page))
(defmethod current-page :home []
  [main-view])
(defmethod current-page :resume []
  [resume-view])
(defmethod current-page :projects []
  [projects-view])
(defmethod current-page :article []
  (let [{:keys [title]} (@app-state :params)]
    (article-view title)))
(defmethod current-page :default []
  [:div "It seems that you are lost buddy."])