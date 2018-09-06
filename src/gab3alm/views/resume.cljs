(ns gab3alm.views.resume
  (:require [reagent.core :refer [atom]]
            [gab3alm.components.navbar :refer [navigation-bar]]
            [gab3alm.components.headings :refer [heading1]]
            [gab3alm.components.experience :refer [experience-marker skill-marker]]
            [gab3alm.components.sectional :refer [section]]))

(def experience
  [{:company          "Pennymac"
    :title            "Jr. Application Developer"
    :date-range       "June 2017 - Present"
    :responsibilities ["Maintained existing apps and helped architect upcoming projects."
                       "prepared/oversaw production deployments for two business critical applications"
                       "Maintained/developed REST API’s for three applications"
                       "Improved app stability by setting test driven development (TDD) standards."
                       "Ported application to AWS serverless environment (S3, Lambdas, API Gateway)"
                       "Worked alongside fellow developers, architects, quality assurance, business analysts, and executives to develop applications useful for all parties involved."]}

   {:company          "california state university northridge, career center"
    :title            "web developer"
    :date-range       "July 2015 - May 2017"
    :responsibilities ["Increased department’s landing page traffic by improving presentation of content"
                       "Spearheaded development of messages/task assigning application"
                       "Documented application features for future developers"
                       "Implemented layouts and UX using adobe photoshop and Experience Design"
                       "Developed and executed projects from sketches to production releases"]}])


(def skills
  [{:domain "frontend"
    :skills ["javascript (ES6, Coffeescript)"
             "react"
             "redux"
             "clojurescript"
             "SASS"
             "bootstrap, foundation"
             "HTML5"
             "CSS3"
             "Jquery"]}
   {:domain "UI/UX"
    :skills ["photoshop"
             "illustrator"
             "figma"
             "experience design"]}
   {:domain "backend"
    :skills ["meteor JS"
             "node JS"
             "express"
             "clojure"
             "graphql"]}
   {:domain "databases"
    :skills ["mongoDB"
             "postgres"
             "SQL"]}
   {:domain "version control"
    :skills ["git"
             "github"
             "gitlab"]}
   ])

(defn resume-view
  "My loyal resume buddy that vouches for my skills no matter the font."
  []
  [:div {:class "row"}

   [:div {:class "col-xs-12 col-md-4" :id "left-container"}
    [:div {:class "sideway-slab"}]
    [:img {:class "brand-image" :src "/images/me.png"}]]

   [:div {:class "col-xs-12 col-md-8" :id "right-container"}
    (navigation-bar)

    (heading1 "Experience")
    (for [entry experience]
      ^{:key (str "entry-" (:company entry))}
      (experience-marker entry))

    (heading1 "Skills")
    (for [entry skills]
      ^{:key (str "entry-" (:domain entry))}
      (skill-marker entry))

    (heading1 "Education")
    (heading1 "Projects")

    ]])