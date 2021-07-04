(def calcularSalario
  (fn [horas,preco_hora]
    (* horas,preco_hora)))
(def imprimiSaida
  (fn [number,salary] (printf "NUMBER = %d\n",number)(printf "SALARY = U$ %.2f\n",salary)))

(def number (Integer. (read-line)))
(def horas (Integer. (read-line)))
(def preco_hora (Double. (read-line)))

(imprimiSaida number,(calcularSalario horas,preco_hora))
