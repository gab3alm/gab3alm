(ns gab3alm.core
    (:require [reagent.core :as reagent :refer [atom]]
              [gab3alm.views.landing :refer [landing-page]]))

(enable-console-print!)

(defonce app-state (atom {:text "Hello world!"}))

(defn main-view []
  [:div {:id "portfolio-wrapper" :class "container-fluid"}
   [:div {:class "row"}
    [:div {:class "col"}
     [landing-page]]]])

(reagent/render-component [main-view]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
