(ns gab3alm.components.gist
  (:require [reagent.core :as r]))

(defn gist-link [link] (str "https://gist.github.com/" link ".js"))

(defn gist [id]
  (let [!ref (r/atom nil)
        display-gist (fn []
                       (let [iframe-ref @!ref
                             gist-document (or (.-document iframe-ref)
                                               (.-contentDocument iframe-ref)
                                               (.-contentWindow.-document iframe-ref))
                             gist-link (gist-link id)
                             gist-id (str "gist-" id)
                             resize-script (str "onload=\"parent.document.getElementById('" gist-id "').style.height=document.body.scrollHeight + 'px'\"")
                             gist-script (str "<script type='text/javascript' src='" gist-link "'></script>")
                             gist-styles (str "<style>*{font-size:12px;}</style>")
                             iframe-content (str "<html><head><base target='_parent'>" gist-styles "</head><body " resize-script ">" gist-script "</body></html>")]
                         (.open gist-document)
                         (.writeln gist-document iframe-content)
                         (.close gist-document)))]
    (r/create-class
      {:display-name        "github-gist"
       :component-did-mount display-gist
       :component-did-update display-gist
       :reagent-render      (fn []
                              [:iframe {:ref #(reset! !ref %)
                                        :width "100%"
                                        :frameBorder 0
                                        :id (str "gist-" id)}])})))