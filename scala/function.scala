val hobbits = List("Frode", "Sam")
hobbits.foreach(hobbit => println(hobbit))

val num_list = List(1, 2, 3)
val sum = (0 /: num_list) {(sum, i) => sum + i}
println(sum)
