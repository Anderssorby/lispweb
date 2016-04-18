(ns lispweb.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [lispweb.layout :refer [error-page]]
            [lispweb.routes.home :refer [home-routes]]
            [compojure.route :as route]
            [lispweb.middleware :as middleware]))

(def app-routes
  (routes
    (wrap-routes #'home-routes middleware/wrap-csrf)
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))

(def app (middleware/wrap-base #'app-routes))
