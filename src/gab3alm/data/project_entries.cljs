(ns gab3alm.data.project-entries
  (:require [clojure.string :as str]))

(def project-entries
  [{:title       "Greenify Backend & Database"
    :tags        ["postgres" "javascript" "backend"]
    :link        "/#/article/greenify"
    :img-name    "greenify.svg"
    :description "Greenify is a small budget making tool that helps tracks your existing accounts and payments.
                                     The Greenify project allows users to use basic income information and their pending accounts in order to
                                     create payment schedules"}

   {:title       "InQontrol Introduction"
    :tags        ["postgres" "javascript" "backend" "frontend"]
    :link        ""
    :img-name    "inqontrol.svg"
    :description "InQontrol frees you from having to keep an eye on your inventory. This application is designed to
                                     keep track of your inventory and all the customers that have checked out items"}

   {:title       "Uplife bringing health to you"
    :tags        ["postgres" "javascript" "backend" "frontend"]
    :link        ""
    :img-name    "uplife.svg"
    :description "Uplife helps in your search for wellness. A healthy lifestyle should never take the backseat in
                                     your priorities. Come and find all your natural and organic products at uplife."}

   {:title       "Successful Interviewing"
    :tags        ["javascript" "backend" "frontend"]
    :link        ""
    :img-name    "interviewing.svg"
    :description "Successful Interviewing seeks to inform/teach students on how to carry themselves during their upcoming interview experiences.
                                     This website gives students tips/advice on how to prepare, behave, and act before and after an interview"}

   {:title       "Lemonaide"
    :tags        ["javascript" "backend" "frontend"]
    :link        ""
    :img-name    "lemonaide.svg"
    :description "Lemonaide helps you locate, communicate, and assign tasks to anybody in the office. From assigning tasks to
                                     keeping an eye on that troublesome intern, Lemonaide will improve the quality of your day!"}

   {:title       "Boba Tea House"
    :tags        ["javascript" "backend" "frontend"]
    :link        ""
    :img-name    "bobatea.svg"
    :description "Boba Jungle serves as POS application for stores that sell boba and tea. The main purpose of the application is
                                     to intrigue users with the eye pleasing aesthetics and lead them towards finalizing a purchase"}


   {:title       "CSUN NSLS"
    :tags        ["javascript" "backend" "frontend"]
    :link        ""
    :img-name    "nsls.svg"
    :description "The main purpose of this site is to provide answers for member questions that are specifically focused on the CSUN Chapter activities.
                                     The site also serves as a way to keep track of event attendance. Executive members can create and manage events"}

   ])