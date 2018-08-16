(ns gab3alm.components.sectional)

(defn section [{:keys [text button link]}]
  [:div {:key (str link "-section") :class "section-container"}
   [:p {:class "section-info"} text]
   [:a {:class "btn section-btn" :href link :role "button"} button]])