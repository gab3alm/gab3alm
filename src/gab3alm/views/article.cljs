(ns gab3alm.views.article
  (:require [gab3alm.components.navbar :refer [navigation-bar]]
            [gab3alm.components.headings :refer [heading1]]
            [gab3alm.data.articles :refer [articles]]))

(defn article-view
  "returns the article view for a given article"
  [article-title]
  (let [{:keys [series title tags body]} (get articles (keyword article-title) {})]
    [:div {:class "article-container"}
     [:span {:class "yellow-stripe"}]

     [:div {:class "row"}
      [:div {:class "col"}
       (navigation-bar)

       [:div {:class "article"}
        (heading1 series)
        [:h3 title]
        [:div {:class "tag-container"}
         (for [tag tags]
           [:span {:key tag :class "tag"} "#" tag])]
        [:div {:class "row"}
         [:div {:class "col-xs-12 col-sm-8 offset-sm-2 col-md-8 offset-md-2 col-lg-6 offset-lg-3"}
          [:div {:class "article-body"}
           (for [body-element body]
             body-element)]]]]]]]))