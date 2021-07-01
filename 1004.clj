(def a (Integer. (read-line)))
(def b (Integer. (read-line)))
(def x (* a b))
(def imprimiSaida
  (fn [x] (println "PROD =" x)))
(imprimiSaida x)
