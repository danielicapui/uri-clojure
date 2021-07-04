(def calcularDiferenca
  (fn [a,b,c,d]
    (-(* a,b),(* c,d))))
(def imprimiSaida
  (fn [x] (printf "DIFERENCA = %d\n",x)))

(def a (Integer. (read-line)))
(def b (Integer. (read-line)))
(def c (Integer. (read-line)))
(def d (Integer. (read-line)))

(imprimiSaida (calcularDiferenca a,b,c,d))
