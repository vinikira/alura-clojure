(ns loja.aula02)

(def minha-lista [1 2 3 4 5 6])

(defn conta
  "conta os elementos"
  [quanto-ate-agora sequencia]
  (if (seq sequencia)
    (recur (inc quanto-ate-agora) (next sequencia))
    quanto-ate-agora))

(conta 0 minha-lista)

(defn conta-loop
  "conta com loop"
  [elementos]
  (loop [total               0
         elementos-restantes (rest elementos)]
    (if (seq elementos-restantes)
      (recur (inc total) elementos-restantes)
      total)))
