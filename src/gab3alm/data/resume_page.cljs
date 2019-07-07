(ns gab3alm.data.resume-page)

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