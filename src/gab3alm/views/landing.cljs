(ns gab3alm.views.landing
  (:require [reagent.core :refer [atom]]
            [gab3alm.components.navbar :refer [navigation-bar]]
            [gab3alm.components.headings :refer [heading1]]
            [gab3alm.components.sectional :refer [section]]
            [gab3alm.components.previews :refer [preview-widget]]))

(def intro
  {:intro  {:text   [:h1 {:class "text-center section-info"} "Hello there! I'm " [:span {:class "highlight"} "Gabriel Almendarez"]]
            :button ""}
   :into-1 {:text   "A software developer with a passion for creating fullstack solutions using Javascript and Clojure"
            :class "intro-description"
            :button ""}})

(def messages
  {:resume   {:text   "Whether its (React, Clojurescript, Sass, Webpack) on the frontend, or (Clojure, Node, Postgres) on the backend, I enjoy working with all kinds of technologies. Mostly, I enjoy working in a team that thrives on learning and experimenting with new technologies. Check out my resume to see all the skills that I can provide for you or your team."
              :button "resume"
              :link   "/#/resume"}})

(def projects-to-preview
  [{:title "Lets build a postgres backend for Greenify" :link ""}
   {:title "A quick look into InQontrol" :link ""}
   {:title "CSUN Career Center - Successful Interviewing" :link ""}])

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