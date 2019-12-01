package com.scala.study.ch1

/**
  * Description:模式匹配
  * Author:lujinyong
  * Date:2017/9/11 21:42
  */
object CaseTest {

  def main(args: Array[String]): Unit = {
    println(matchTest(3))
    //值与不同类型的模式相匹配
    println(matchTest2("two"))
    println(matchTest2("test"))
    println(matchTest2(1))
    //使用case类匹配
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println(
          "Age: " + age + " year, name: " + name + "?")
      }
    }
  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  def matchTest2(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case _ => "many"
  }


  case class Person(name: String, age: Int)

}
