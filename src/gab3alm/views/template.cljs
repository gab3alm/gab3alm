(ns gab3alm.views.template
  (:require [gab3alm.views.landing :refer [landing-page]]))

(defn main-view []
  [:div {:id "portfolio-wrapper" :class "container-fluid"}
   [:div {:class "row"}
    [:div {:class "col"}
     [landing-page]]]])