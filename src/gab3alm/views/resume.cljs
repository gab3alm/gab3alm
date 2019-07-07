(ns gab3alm.views.resume
  (:require [reagent.core :refer [atom]]
            [gab3alm.components.navbar :refer [navigation-bar]]
            [gab3alm.components.headings :refer [heading1]]
            [gab3alm.components.experience :refer [experience-marker skill-marker]]
            [gab3alm.data.resume-page :refer [experience skills]]
            [gab3alm.components.sectional :refer [section]]))

(defn resume-view
  "My loyal resume buddy that vouches for my skills no matter the font."
  []
  [:div {:class "row"}

   [:div {:class "col-xs-12 col-md-4" :id "left-container"}
    [:div {:class "sideway-slab"}]
    [:img {:class "brand-image" :src "/images/me.png"}]]

   [:div {:class "col-xs-12 col-md-8" :id "right-container"}
    (navigation-bar)

    (heading1 "Experience")
    (for [entry experience]
      (experience-marker (key entry) (val entry)))

    (heading1 "Skills")
    (for [entry skills]
      (skill-marker (key entry) (val entry)))

    (heading1 "Education")
    [:div {:class "education-container"}
      [:p {:class "school"} "california state university, northridge"]
      [:p {:class "degree"} "B.S. computer engineering, 2017"]]

    (heading1 "Contact Me")
    [:p {:class "text"} "If you are interested in the skills that I can provide to your team, lets get in contact!"]
    [:p {:class "email"} "Email: galmendarez4896@gmail.com"]
    ]])