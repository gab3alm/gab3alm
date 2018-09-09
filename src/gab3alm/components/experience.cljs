(ns gab3alm.components.experience)


(defn experience-marker
  "Component demonstrates the experience that the user has suffered through"
  [title {:keys [company title date-range responsibilities] :as experience}]
  [:div {:key (str title "-container") :class "entry-container"}
   [:p {:class "company-name"} company]
   [:p {:class "title"} title]
   [:p {:class "date-range"} date-range]
   [:ul {:class "responsibilities"}
    (for [task responsibilities]
      ^{:key (str "task-" task)}
      [:li  task])]])

(defn skill-marker
  "Component that shows the skills that the user knows"
  [title {:keys [domain skills] :as skill}]
  [:div {:key (str title "-container") :class "skills-container"}
   [:p {:class "domain"} domain]
   [:ul {:class "skill-list"}
    (for [skill skills]
      ^{:key (str title "-" skill)}
      [:li skill])]])