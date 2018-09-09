(ns gab3alm.views.landing
  (:require [reagent.core :refer [atom]]
            [gab3alm.components.navbar :refer [navigation-bar]]
            [gab3alm.components.headings :refer [heading1]]
            [gab3alm.components.sectional :refer [section]]))

(def messages
  {:journal  {:text "My name is Gabriel Almendarez. I'm a software developer with a burning passion for both frontend and backend development. If I'm not busy implementing a layout, then you will probably find me messing around with some API on the backend."
              :button "journal"}

   :projects {:text "Whether its the backend or frontend, I enjoy learning new technologies. Within the frontend world, I have used React, Redux, Angular, Webpack in order to create frontend designs. In the backend world, I have used Express and clojure in order to create stable backend services."
              :button "projects"}

   :resume   {:text   "I could keep going about the technologies that I have used in the past, but I don’t want to bore you with that. But If you insists, you can check out my cool resume."
              :button "resume"
              :link   "/#/resume"}
   })

(defn landing-page []
  [:div {:class "row"}
   [:div {:class "col-xs-12 col-md-6" :id "left-container"}
    [:div {:class "sideway-slab"}]
    [:img {:class "brand-image" :src "/images/me.png"}]]
   [:div {:class "col-xs-12 col-md-6" :id "right-container"}
    (navigation-bar)
    (heading1 "welcome")
    (for [item messages]
      (section (key item) (val item)))]])