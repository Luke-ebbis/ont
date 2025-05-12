(ns ont.ont
  (:require [tawny.owl :as t]
            [tawny.reasoner :as r]))

(r/reasoner-factory :hermit)

#_{:clj-kondo/ignore [:unresolved-symbol]}
(t/defontology bio
  :iri "http://example.com/biordf"
  :noname true)


(t/as-disjoint
  (t/defclass DataBase
    :label "A database"
    :comment "A system that stores information and can send it to the user.")
  (t/defclass DatabaseRecord))

(t/defclass LinkedRecord
  :subclass DatabaseRecord
  :label "A link represents a record that is shared between two databases")




