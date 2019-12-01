package com.scala.study.ch1

/**
  * Description:
  * Author:lujinyong
  * Date:2019/12/1 17:08
  */
trait CarId {
  var id :Int
  def currentId():Int //定义抽象方法
}
trait CarGreeting{
  def greeting(msg:String){println(msg)}
}
class BYDCarId extends CarId{
  override var id: Int = 10000//BYD汽车编号从10000开始
  override def currentId(): Int = {id += 1;id}//返回汽车编号
}
class BMWCarId extends CarId{
  override var id: Int = 20000//BMW汽车编号从10000开始
  override def currentId(): Int = {id += 1;id}//返回汽车编号
}
object MyCar2{
  def main(args: Array[String]): Unit = {
    val myCarId1 = new BYDCarId()
    var myCarId2 = new BMWCarId()
    printf("My first CarId is %d.\n",myCarId1.currentId())
    printf("My second CarId is %d.\n",myCarId2.currentId())
  }
}
