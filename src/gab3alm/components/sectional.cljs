(ns gab3alm.components.sectional)

(defn section [title {:keys [text button link]}]
  [:div {:key (str title "-section") :class "section-container"}
   [:p {:class "section-info"} text]
   (when (and button link)
     [:a {:class "btn section-btn" :href link :role "button"} button])])