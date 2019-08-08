(ns gab3alm.data.articles
  (:require [gab3alm.components.gist :refer [gist]]))

(defn get-image
  [root image-name]
  (str root image-name))

(def greenify-image (partial get-image "/images/projects/greenify/"))

(def articles
  {:greenify {:series "let's build it!"
              :title  "Greenify Postgres Setup"
              :tags   ["postgres" "personal-project"]
              :body   [[:p "Greenify is a small budget making tool that tracks your existing accounts and payments.
                            The Greenify project allows users to use basic income information and their pending accounts
                            in order to create payment schedules."]
                       [:p "The end product will resemble something like the following."]
                       [:img {:src (greenify-image "greenify.jpg")}]
                       [:div {:class "text-center"}
                        [:a {:href "https://www.figma.com/file/FNzDTunSUsrLj0R3gvkEKVyD/BudgetLab?node-id=0%3A1" :target "_blank"} "View UI (Figma)"]]
                       [:p "The first step towards starting a project is the planning phase."]
                       [:p "Greenify will contains the following aspects:"]
                       [:ul [:li "Postgres Database"] [:li "Graphql Server"] [:li "ReactJS Frontend"]]
                       [:p "This article will go over the persistent storage solution and part of the backend server. When designing the database it is useful to take a look at the bigger picture (UI) and look at all the information required."]
                       [:p "Looking at the Greenify UI tells us that this project will require the following elements:"]
                       [:ul [:li "Users"] [:li "Accounts"] [:li "Payments"]]
                       [:h3 "Users" [:hr]]
                       [:p "Like any great application, Greenify will have users. Users only need to share basic income information, such as:"]
                       [:ul [:li "payment period (How often a user gets paid)"] [:li "payment per period (How much a user gets paid per period)"]]
                       [:img {:class "sm-img" :src (greenify-image "income_information.jpg")}]
                       [:h3 "Open Accounts" [:hr]]
                       [:p "Users need to be able to keep track of their accounts so there must be account records within the database."]
                       [:img {:class "sm-img" :src (greenify-image "account.png")}]
                       [:h3 "Payments" [:hr]]
                       [:p "Since our users are responsible people, they usually pay their bills on time. Even if it wasn’t on time, it still gets done. Better late, than never, right?. The database must have a payment table, to keep track of all payments made by the user."]
                       [:img {:class "sm-img" :src (greenify-image "payments.png")}]
                       [:p "And that is it. Greenify is pretty simple on the backend. Greenify makes use of a postgres database for its persistence layer."]
                       [:h3 "Accounts - Table Schema" [:hr]]
                       [gist "4f8002fe43ac7a47c2db762cb2d25448"]
                       [:h3 "Payee - Table Schema" [:hr]]
                       [gist "548e8ea4ab27be7f873bd69d1ce22c75"]
                       [:h3 "Payments - Table Schema" [:hr]]
                       [gist "0b036e3acd3c48ada786b3097755bd48"]
                       [:p "Perfect! Your postgres tables are now ready to hold some data.\nThe next step is to build your backend!"]
                       ]}})