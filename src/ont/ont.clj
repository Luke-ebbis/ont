(ns ont.ont
  (:require [tawny.owl :as t]
            [tawny.reasoner :as r]))

#_{:clj-kondo/ignore [:unresolved-symbol]}
(t/defontology pizza
  :iri "http://mo.com/pizza"
  :noname true)
