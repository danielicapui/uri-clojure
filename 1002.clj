(def calcularArea 
    (fn[r,n]
        (* r,r,n)))
(def imprimirSaida
    (fn [area]
        (printf "A=%.4f\n" area)))
(def r (Double.(read-line)))
(def n 3.14159)
(def area (calcularArea r,n))
(imprimirSaida area)