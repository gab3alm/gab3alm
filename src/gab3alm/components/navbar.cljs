(ns gab3alm.components.navbar)

(defn navigation-bar []
  [:nav {:class "navbar navbar-expand-lg"}
   ;navbar items
   [:ul {:class "navbar-nav ml-auto"}
    [:li {:class "nav-item"} [:a {:href "" :class "nav-link"} "journal"]]
    [:li {:class "nav-item"} [:a {:href "" :class "nav-link"} "projects"]]
    [:li {:class "nav-item"} [:a {:href "/#/resume" :class "nav-link"} "resume"]]]
   [:a {:class "navbar-brand" :href "#"} [:img {:src "/images/logo.svg"}]]
   ])