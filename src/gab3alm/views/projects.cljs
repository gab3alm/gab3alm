(ns gab3alm.views.projects
  (:require [reagent.core :refer [atom]]
            [gab3alm.components.navbar :refer [navigation-bar]]
            [gab3alm.components.headings :refer [heading1]]
            [gab3alm.components.previews :refer [project-entry]]
            [gab3alm.data.project-entries :refer [project-entries]]
            ))

(defn projects-view []
      [:div {:class "projects-container"}
       ;navigation bar for the projects page
       (navigation-bar)

       ;container for projects view
       [:div {:class "container"}
        (heading1 "Projects")
        [:div {:class "row"}
         (map #(project-entry %) project-entries)]]])