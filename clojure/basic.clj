(println "Hello World!")
(println (+ 1 1))
(println (str "one : " 1 " two : " 2))

(if (< 1 2) (println "It's true") (println "It's not true"))

(println ([:jiho, :yas, :man] 2))
(println (rest [:jiho, :yas, :man]))


(defn force-it
"The first func" [jedi] (str "Use the force, " jedi))
(println (force-it "Jihoon"))


(defn twice-count [w] (* 2 (count w)))
(println (twice-count "jihooni"))
(println (map twice-count ["jihooni", "man"]))


(def words ["luke" "chewie" "han" "lando"])
(println (filter (fn [word] (> (count word) 4)) words))

(println (take 5 (drop 2 (cycle [:lather :rinse :repeat]))))
(println (->> [:lather :rinse :repeat] (cycle) (drop 2) (take 5)))