class Person2(val name : String)

trait Nice {
  def greet() = println("Holy Moly")
}

class Character(override val name : String) extends Person2(name) with Nice

val flanders = new Character("New")
flanders.greet