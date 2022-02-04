def fact(n : Int) : Int = n match{
  case 0 => 1
  case x if x > 0 => fact(n - 1) * n
}

println(fact(3))
println(fact(6))