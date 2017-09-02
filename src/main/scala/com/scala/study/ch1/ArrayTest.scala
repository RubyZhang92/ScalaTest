package com.scala.study.ch1
import Array._

/**
  * Description:数组
  * Author:lujinyong
  * Date:2017/9/2 22:30
  */
object ArrayTest {
  def main(args: Array[String]): Unit = {
    var myList = Array(1.1,1.2,1.3,1.4,1.5)
    var total = 0.0
    var max = 0.0;
    for(x <- myList){
      println(x)
      total += x
      if(x>max) max = x
    }
    println(total)
    println(myList(3))
    println(max)

    //////////二维数组///////////////
    var myMatrix = ofDim[Int](3,3);

    //build a matrix
    for(i <- 0 to 2){
      for (j <- 0 to 2){
        myMatrix(i)(j) = i+j;
      }
    }
    //打印二维数组
    for(i <- 0 to 2){
      for(j <- 0 to 2){
        print(" "+myMatrix(i)(j))
      }
      println()
    }

    //连接数组生成新的数组
    var myList2 = Array(2.1,2.2,2.3,2.4,2.5)
    var myList3 = concat(myList,myList2)
    for(x <- myList3){
      println(x)
    }

    //使用range（）方法创建数组
    var myList4 = range(10,20)
    for(x <- myList4){
      println(x)
    }

    var myList5 = range(10,20,2)//步调是2
    for(x <- myList5){
      println(x)
    }

  }
}
