(ns gab3alm.components.project-previews)

(defn project-pill
  "creates project pill for the preview page"
  [{:keys [title link] :as project}]
  [:a {:key (str "project-" title) :class "project-pill" :href (str "/#/" link)}
   [:div {:class "hanger"}]
   [:p {:class "title"} title]])

(defn preview-widget
  "Display a preview widget for the provided sample-projects"
  [title sample-projects]
  [:div {:class "preview-projects container"}
   [:div {:class "row"}
    [:div {:class "col-sm-10 offset-sm-1"}
     [:p {:class "section-title"} title]
     (for [project sample-projects]
       (project-pill project))
     [:a {:class "btn section-btn" :href "/#/projects" :role "button"} "All Projects"]]]])