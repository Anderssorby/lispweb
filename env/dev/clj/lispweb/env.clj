(ns lispweb.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [lispweb.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[lispweb started successfully using the development profile]=-"))
   :middleware wrap-dev})
