package com.scala.study.ch1

/**
  * Description:
  * Author:lujinyong
  * Date:2019/12/1 16:21
  */
abstract class Car {//抽象类，不能直接被实例化,必须使用abstract关键字
  val carBrand:String //字段没有初始化值，就是一个抽象字段，但是必须声明类型，否则编译报错
  def info() //抽象方法，不需要使用abstract关键字
  def greeting(){println("welecome to my car")}
}
class BMWCar extends Car{
  override val carBrand ="BMW" //重写超类字段，使用override关键字否则编译报错
  //重写超类抽象方法时，不需要使用override关键字，不过如果加上override编译也不会报错
  def info(){printf("This is a %s car\n",carBrand)}
  //重写超类的非抽象方法，必须使用关键字override
  override def greeting(){println("welcome to my BMW car")}
}
class BYDCar extends  Car{
  override val carBrand ="BYD" //重写超类字段，使用override关键字否则编译报错
  //重写超类抽象方法时，不需要使用override关键字，不过如果加上override编译也不会报错
  def info(){printf("This is a %s car\n",carBrand)}
  //重写超类的非抽象方法，必须使用关键字override
  override def greeting(){println("welcome to my BYD car")}
}
object MyCar{
  def main(args: Array[String]): Unit = {
    val myCar1 = new BMWCar()
    val myCar2 = new BYDCar()
    myCar1.greeting()
    myCar1.info()
    myCar2.greeting()
    myCar2.info()
  }
}