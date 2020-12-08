(ns day1)
(use '[clojure.core])

(defn partOne
  [input]
  (-> input
      println))

(defn run
  [opts]
  (def input (slurp "src/day1.txt"))
  (partOne input))
