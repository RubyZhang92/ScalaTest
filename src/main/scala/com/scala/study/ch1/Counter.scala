package com.scala.study.ch1

class Counter {
  private var value = 0 //value用来存储计时器的起始值
  private var name = "" //表示计数器的名称
  private var mode = 1 //mode用来表示计数器类型(比如，1表示步数计数器，2表示时间计数器)
  def this(name: String) {
    //第一个辅助构造器
    this() //调用主构造器
    this.name = name
  }

  def this(name: String, mode: Int) {
    //第二个辅助构造器
    this(name) //调用前一个辅助构造器
    this.mode = mode
  }

  def increment(step: Int): Unit = {
    value += step
  }

  def current(): Int = {
    value
  }

  def info(): Unit = {
    printf("Name:%s and mode is %d\n", name, mode)
  }
}

object MyCounter {
  def main(ars: Array[String]) {
    val myCounter1 = new Counter //主构造器
    val myCounter2 = new Counter("Runner") //第一个辅助构造器，计数器的名称设置为Runner，用来计算跑步步数
    val myCounter3 = new Counter("Timer", 2) //第二个辅助构造器，计数器的名称设置为Timer，用来计算秒数
    myCounter1.info //显示计数器信息
    myCounter1.increment(1) //设置步长
    printf("Current value is : %d\n", myCounter1.current) //显示计数器当前值
    myCounter2.info //显示计数器信息
    myCounter2.increment(2) //设置步长
    printf("Current value is : %d\n", myCounter2.current) //显示计数器当前值
    myCounter3.info //显示计数器信息
    myCounter3.increment(3) //设置步长
    printf("Current value is : %d\n", myCounter3.current) //显示计数器当前值
  }
}