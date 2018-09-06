(ns gab3alm.components.experience)


(defn experience-marker
  "Component demonstrates the experience that the user has suffered through"
  [{:keys [company title date-range responsibilities] :as experience}]
  [:div {:class "entry-container"}
   [:p {:class "company-name"} company]
   [:p {:class "title"} title]
   [:p {:class "date-range"} date-range]
   [:ul {:class "responsibilities"}
    (for [task responsibilities]
      ^{:key (str "task-" task)}
      [:li  task])]])

(defn skill-marker
  "Component that shows the skills that the user knows"
  [{:keys [domain skills] :as skill}]
  [:div {:class "skills-container"}
   [:p {:class "domain"} domain]
   [:ul {:class "skill-list"}
    (for [skill skills]
      ^{:key (str "skill-" skill)}
      [:li skill])]])