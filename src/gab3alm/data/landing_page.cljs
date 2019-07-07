(ns gab3alm.data.landing-page)

(def intro
  {:intro  {:text   [:h1 {:class "text-center section-info"} "Hello there! I'm " [:span {:class "highlight"} "Gabriel Almendarez"]]
            :button ""}
   :into-1 {:text   "A software developer with a passion for creating fullstack solutions using Javascript and Clojure"
            :class "intro-description"
            :button ""}})

(def messages
  {:resume   {:text   "Whether its (React, Clojurescript, Sass, Webpack) on the frontend, or (Clojure, Node, Postgres) on the backend, I enjoy working with all kinds of technologies. Mostly, I enjoy working in a team that thrives on learning and experimenting with new technologies. Check out my resume to see all the skills that I can provide for you or your team."
              :button "resume"
              :link   "/#/resume"}})

(def projects-to-preview
  [{:title "Lets build a postgres backend for Greenify" :link ""}
   {:title "A quick look into InQontrol" :link ""}
   {:title "CSUN Career Center - Successful Interviewing" :link ""}])