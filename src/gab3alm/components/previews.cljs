(ns gab3alm.components.previews)

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
     [:a {:class "btn section-btn section-btn-right" :href "/#/projects" :role "button"} "All Projects"]]]])

(defn get-image-url
      [image-name]
      (str "/images/project_icons/" image-name))

(defn get-tags
  [tags]
  (apply str (map #(str "#" % " ") tags)))

(defn get-figma-link
  [link]
  (str "https://figma-short.glitch.me/" link))

(defn project-entry
      "displays a preview for a project entry for"
      [{:keys [title tags link img-name description]}]
      [:div {:key title :class "col-sm-12 col-md-6 col-lg-4"}
       [:div {:class "card project-entry"}
        [:img {:class "card-img-top" :src (get-image-url img-name)}]
        [:div {:class "card-body"}
         [:h5 {:class "card-title"} title]
         [:p {:class "card-tags"} (get-tags tags)]
         [:p {:class "card-text"} description]
         [:div {:class "text-center"}
          [:a {:class "btn section-btn project-btn" :target "_blank" :href link :role "button"} "View"]]]]])