package com.scala.study.ch1

/**
  * Description:
  * Author:lujinyong
  * Date:2019/12/1 8:52
  */
class Counter2 (val name:String,val mode:Int){
  private var value = 0
  def increment(step:Int):Unit = {value += step}
  def current():Int = {value}
  def info():Unit = {printf("Name:%s and mode is %d\n",name,mode)}
}
object MyCounter2{
  def main(args: Array[String]): Unit = {
    val myCounter2 = new Counter2("Timer",2)
    myCounter2.info()
    myCounter2.increment(1)
    printf("Current value is:%d\n",myCounter2.current())
  }
}
