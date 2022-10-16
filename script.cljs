(ns script
  (:require
   [deps]
  ;;  [cheshire.core :as json]
   [honey.sql :as sql]
  ;;  [muuntaja.core :as muuntaja]
   ))

(prn (sql/format {:select :* :from :dude}))

;; (def options (muuntaja/default-options))
;; (prn "options" options)

;; (prn (json/generate-string {:foo "bar" :baz {:eggplant [1 2 3]}} {:pretty true}))
