package com.scala.study.ch1

/**
  * Description:for和while循环
  * Author:lujinyong
  * Date:2017/8/27 21:17
  */
object ForWhileTest {
  def main(args: Array[String]): Unit = {
    var a = 10
    while (a < 20) {
      println(a)
      a += 1
    }

    var b = 10
    do {
      println(b)
      b += 1
    } while (b < 20)

    var c = 0
    for (c <- 1 to 10) {
      println("c:" + c)
    }

    //for循环中，循环将遍历给定范围内的所有可能的计算，可以使用分号 (;) 分隔多个范围。下面是使用两个范围的例子，也可以使用两个以上的范围。
    for (c <- 1 until 10) {
      println(c)
    }
    var c1 = 0
    var c2 = 0
    for (c1 <- 1 to 3; c2 <- 1 to 3) {
      println("c1:" + c1 + ",c2:" + c2)
    }
    /*c1:1,c2:1
    c1:1,c2:2
    c1:1,c2:3
    c1:2,c2:1
    c1:2,c2:2
    c1:2,c2:3
    c1:3,c2:1
    c1:3,c2:2
    c1:3,c2:3*/

    //for 循环使用集合
    var d = 0;
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (d <- numList) {
      println("d:" + d)
    }

    //for 循环使用过滤器
    var e = 0
    for (e <- numList if e != 3; if e < 8) {
      println("e:" + e)
    }

    //for循环采用yield:可以从存储中返回for循环中的变量的值，也可以通过函数返回。要做到这一点，可以通过关键字yield前缀的for表达式体，如下所示：
    //注意在大括号已被用来保持变量和条件以及retVal的是其中f的所有值将被储存在收集的形式的变量。
    var f = 0
    val retVal = for {f <- numList if f != 3; if f < 8} yield f
    for (f <- retVal) {
      println("f:" + f)
    }



  }
}

