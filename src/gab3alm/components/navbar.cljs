(ns gab3alm.components.navbar)

(defn navigation-bar []
  [:nav {:class "navbar navbar-expand-lg"}
   ;button toggler
   [:button {:class "navbar-toggler" :type "button" :data-toggle "collapse" :data-target "#navbarItems" :aria-controls "navbarItems" :aria-expanded "false" :aria-label "Toggle Navigation"}
    [:span {:class "navbar-toggler-icon"}]]

   ;navbar items
   [:div {:class "collapse navbar-collapse" :id "navbarItems"}
    [:ul {:class "navbar-nav ml-auto"}
     [:li {:class "nav-item"} [:a {:href "" :class "nav-link"} "journal"]]
     [:li {:class "nav-item"} [:a {:href "" :class "nav-link"} "projects"]]
     [:li {:class "nav-item"} [:a {:href "" :class "nav-link"} "resume"]]
     ]]])