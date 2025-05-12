(ns ont.core
  [:use [tawny.owl]]
  [:require [ont.ont]])

(defn -main [& args]
  (tawny.owl/save-ontology ont.ont/bio "pizza.omn"))
