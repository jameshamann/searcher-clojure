(ns searcher-clojure.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [searcher-clojure.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[searcher-clojure started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[searcher-clojure has shut down successfully]=-"))
   :middleware wrap-dev})
