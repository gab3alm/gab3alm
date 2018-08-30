(ns gab3alm.routes
  (:import goog.history.Html5History)
  (:require [secretary.core :as secretary :refer-macros [defroute]]
            [goog.events :as events]
            [goog.history.EventType :as EventType]
            [reagent.core :as reagent :refer [atom]]
            [gab3alm.views.template :refer [main-view]]))

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
  (hook-browser-navigation!))

(defmulti current-page #(@app-state :page))
(defmethod current-page :home []
  [main-view])
(defmethod current-page :resume []
  [:div "Welcome to the resume page."])
(defmethod current-page :default []
  [:div "It seems that you are lost buddy."])