(ns lispweb.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[lispweb started successfully]=-"))
   :middleware identity})
