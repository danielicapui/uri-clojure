(def a (Double. (read-line)))
(def b (Double. (read-line)))
(def c (Double. (read-line)))
(def calcularMedia
  (fn [a,b,c]
    (/ (+ (* a,2.0),(* b,3.0),(* c,5.0)) 10)))
(def imprimiSaida
  (fn [x] (printf "MEDIA = %.1f\n",x)))
(imprimiSaida (calcularMedia a,b,c))
