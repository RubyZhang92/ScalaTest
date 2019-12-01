package com.scala.study.ch1

/**
  * Description:
  * Author:lujinyong
  * Date:2019/12/1 10:49
  */
class TestApplyClassAndObject {

}
class ApplyTest{
  def apply() = println("apply method in class is called")
  def greetingOfClass:Unit = {
    println("greeting method in class is called")
  }
}
object ApplyTest{
  def apply()={
    println("apply method in object is called")
    new ApplyTest()
  }
}
object TestApplyClassAndObject{
  def main(args: Array[String]): Unit = {
    val a = ApplyTest();//这里调用伴生对象中的apply方法
    a.greetingOfClass
    a()//这里调用半生类中的apply方法
  }
}
