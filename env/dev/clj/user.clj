(ns user
  (:require [mount.core :as mount]
            lispweb.core))

(defn start []
  (mount/start-without #'lispweb.core/repl-server))

(defn stop []
  (mount/stop-except #'lispweb.core/repl-server))

(defn restart []
  (stop)
  (start))


