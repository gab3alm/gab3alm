(ns gab3alm.core
  (:import goog.history.Html5History)
  (:require [gab3alm.routes :refer [app-routes current-page]]
            [reagent.core :as reagent]))

(enable-console-print!)

(do
  (app-routes)
  (reagent/render-component [current-page]
                            (. js/document (getElementById "app"))))
