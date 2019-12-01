package com.scala.study.ch1
class TestApplyClass {
  def apply(param:String) :String  = {
    printf("apply method called,param is :%s\n",param)
    "hello world"
  }
}
object TestApplySingleObject{
  def apply(param1:String,param2:String):String={
    println("apply methhod called")
    param1+" and "+ param2
  }
  def main(args: Array[String]): Unit = {
    val obj = new TestApplyClass
    println(obj("test"))
    val obj2 = TestApplySingleObject("zhansan","lisi")
    println(obj2)
  }
}