(def a (Double. (read-line)))
(def b (Double. (read-line)))
(def calcularMedia
  (fn [a,b]
    (/ (+ (* a,3.5),(* b,7.5)) 11)))
(def imprimiSaida
  (fn [x] (printf "MEDIA = %.5f\n",x)))
(imprimiSaida (calcularMedia a,b ))
