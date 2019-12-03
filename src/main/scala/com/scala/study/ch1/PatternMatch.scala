package com.scala.study.ch1

/**
  * Description:
  * Author:lujinyong
  * Date:2019/12/4 6:51
  */
class PatternMatch {

}
object PatternMatch{
  def main(args: Array[String]): Unit = {
    val colorNum = 4
    val colorStr = colorNum match{
      case  1 =>"red"
      case 2 => "green"
      case 3 => "yellow"
      case unexpected => unexpected + " is not allowed"
    }
    println(colorStr)
  }
//  类型模式
//  Scala可以对表达式的类型进行匹配
  for(elem <- List(9,12.3,"Scala",'Spark)){
    val str = elem match{
      case i: Int => i+" is an int value"
      case d: Double => d+" is a double value"
      case "Scala" => "Scala is found"
      case s: String => s + " is a string value"
      case _ => "This is an unexpected value"
    }
    println(str)
  }
//  "守卫(guard)"语句
//    可以在模式匹配中添加一些必要的处理逻辑
  for(elem <- List(1,2,3,4)){
    elem match{
      case _ if(elem %2 == 0) => println(elem + " is even")
      case _ => println(elem + " is odd")
    }
  }
  case class Car(brand:String,price:Int){
    val myBYDCar = new Car("BYD",100000)
    val myBMWCar = new Car("BMW",200000)
    val myBenzCar = new Car("Benz",300000)
    for(car <- List(myBYDCar,myBMWCar,myBenzCar)){
      car match {
        case Car("BYD", 100000) => print("hello BYD")
        case Car("BMW", 200000) => print("hello BMW")
        case Car("Benz", 300000) => print("hello Benz")
      }
    }
  }
}
