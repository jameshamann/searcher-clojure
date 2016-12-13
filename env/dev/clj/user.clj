(ns user
  (:require [mount.core :as mount]
            searcher-clojure.core))

(defn start []
  (mount/start-without #'searcher-clojure.core/repl-server))

(defn stop []
  (mount/stop-except #'searcher-clojure.core/repl-server))

(defn restart []
  (stop)
  (start))


