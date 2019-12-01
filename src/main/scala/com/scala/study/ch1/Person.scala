package com.scala.study.ch1

/**
  * Description:
  * Author:lujinyong
  * Date:2019/12/1 9:04
  */
class Person {
  private val id  = Person.newPersonId()//调用伴生对象的方法
  private var name = ""
  def this(name:String){
    this()
    this.name = name
  }
  def info(){printf("The id of %s %d.\n",name,id)}
}
object Person{
  private var lastId = 0;//身份编号
  def newPersonId()={
    lastId += 1
    lastId
  }

  def main(args: Array[String]): Unit = {
    val person1 = new Person("zhangsan")
    val person2 = new Person("lisi")
    person1.info()
    person2.info()
  }
}
