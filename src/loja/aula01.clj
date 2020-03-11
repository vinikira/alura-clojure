(ns loja.aula01)

(def minha-lista ["vini" "bruna" "murilo" "igor"])

(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)
        resto (rest sequencia)]
    (if (not (nil? primeiro))
      (do
        (funcao primeiro)
        (recur funcao resto)))))

(meu-mapa println minha-lista)
