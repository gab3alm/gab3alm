(ns gab3alm.views.resume
  (:require [reagent.core :refer [atom]]
            [gab3alm.components.navbar :refer [navigation-bar]]
            [gab3alm.components.headings :refer [heading1]]
            [gab3alm.components.experience :refer [experience-marker skill-marker]]
            [gab3alm.components.sectional :refer [section]]))

;;content of web page described in JSON objects. This way, the components can be generated in a loop.
(def experience
  {:pennymac {:company          "Pennymac"
              :title            "Jr. Application Developer"
              :date-range       "June 2017 - Present"
              :responsibilities ["Maintained existing applications and helped architect upcoming projects."
                                 "Prepared/oversaw production deployments for two business critical applications"
                                 "Maintained/developed REST API’s for three production applications"
                                 "Improved application stability by setting test driven development (TDD) standards."
                                 "Ported application to AWS serverless environment (S3, Lambdas, API Gateway)"
                                 "Worked alongside fellow developers, architects, quality assurance, business analysts, and executives to develop applications useful for all parties involved."]}
   :csun {:company          "california state university northridge, career center"
          :title            "web developer"
          :date-range       "July 2015 - May 2017"
          :responsibilities ["Increased department’s landing page traffic by improving presentation of content"
                             "Spearheaded development of messaging/task assigning application"
                             "Documented application features for future developers and transparency"
                             "Implemented layouts and UX using adobe photoshop and Experience Design"
                             "Developed and executed projects from sketches to production releases"]}})


(def skills
  {:frontend  {:domain "frontend"
               :skills ["javascript (ES6, Coffeescript)"
                        "react"
                        "redux"
                        "clojurescript"
                        "SASS"
                        "bootstrap, foundation"
                        "HTML5"
                        "CSS3"
                        "Jquery"]}
   :uiux      {:domain "UI/UX"
               :skills ["photoshop"
                        "illustrator"
                        "figma"
                        "experience design"]}
   :backend   {:domain "backend"
               :skills ["meteor JS"
                        "node JS"
                        "express"
                        "clojure"
                        "graphql"]}
   :databases {:domain "databases"
               :skills ["mongoDB"
                        "postgres"
                        "SQL"]}
   :testing   {:domain "testing"
               :skills ["Fitnesse"
                        "New Relic"]}
   :svc       {:domain "version control"
               :skills ["git"
                        "github"
                        "gitlab"]}})

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
      (experience-marker (key entry) (val entry)))

    (heading1 "Skills")
    (for [entry skills]
      (skill-marker (key entry) (val entry)))

    (heading1 "Education")
    [:div {:class "education-container"}
      [:p {:class "school"} "california state university, northridge"]
      [:p {:class "degree"} "B.S. computer engineering, 2017"]]

    (heading1 "Contact Me")
    [:p {:class "text"} "If you are interested in the skills that I can provide to your team, lets get in contact!"]
    [:p {:class "email"} "Email: galmendarez4896@gmail.com"]
    ]])