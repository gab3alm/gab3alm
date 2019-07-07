(ns gab3alm.views.landing
  (:require [reagent.core :refer [atom]]
            [gab3alm.components.navbar :refer [navigation-bar]]
            [gab3alm.components.headings :refer [heading1]]
            [gab3alm.components.sectional :refer [section]]
            [gab3alm.data.landing-page :refer [projects-to-preview messages intro]]
            [gab3alm.components.previews :refer [preview-widget]]))

(defn landing-page []
  [:div {:class "row"}
   [:div {:class "col-xs-12 col-md-6" :id "left-container"}
    [:div {:class "sideway-slab"}]
    [:img {:class "brand-image" :src "/images/me.png"}]]
   [:div {:class "col-xs-12 col-md-6" :id "right-container"}
    (navigation-bar)
    ;;intro section
    [:div {:class "row text-center"}
     [:div {:class "col"}
      (for [item intro]
        (section (key item) (val item)))]]
    ;;projects preview
    (preview-widget "Latest Projects & Experiments" projects-to-preview)
    ;;intro section cont.
    (for [item messages]
      (section (key item) (val item)))]])