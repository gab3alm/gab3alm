(ns gab3alm.components.sectional)

(defn section [title {:keys [text class button link]}]
  [:div {:key (str title "-section") :class "section-container"}
   (if (string? text)
     [:p {:class (str "section-info" " " class)} text]
     text)
   (when (and button link)
     [:a {:class "btn section-btn" :href link :role "button"} button])])