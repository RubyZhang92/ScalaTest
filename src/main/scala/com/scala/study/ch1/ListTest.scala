package com.scala.study.ch1

/**
  * Description:List
  * Author:lujinyong
  * Date:2017/9/2 23:08
  */
object ListTest {
  def main(args: Array[String]): Unit = {
    // List of Strings
    val fruit: List[String] = List("apples", "oranges", "pears")

    // List of Integers
    val nums: List[Int] = List(1, 2, 3, 4)

    // Empty List.
    val empty: List[Nothing] = List()

    // Two dimensional list
    val dim: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
  //所有列表都可以使用两个基本构建块定义，尾部为Nil和::，它的发音为cons。 Nil也代表空列表。以上列表可以定义如下
    // List of Strings
    val fruit2 = "apples"::("oranges"::("pears"::Nil))

    // List of Integers
    val nums2 = 1::(2::(3::(4::Nil)))

    // Empty List.
    val empty2 = Nil

    // Two dimensional list
    val dim2 = (1::(0::(0::Nil))) ::
      (0::(1::(0::Nil))) ::
      (0::(0::(1::Nil)))::Nil

    //列表基本操作
    val nums3 = Nil

    println( "Head of fruit : " + fruit.head )
    println( "Tail of fruit : " + fruit.tail )
    println( "Check if fruit is empty : " + fruit.isEmpty )
    println( "Check if nums is empty : " + nums3.isEmpty )

    //连接列表
    val fruit3 = "apples"::("oranges"::("pears"::Nil))
    val fruit4 = "mangoes"::("banana"::Nil)
    // use two or more lists with ::: operator
    var fruit5 = fruit3 ::: fruit4
    println( "fruit1 ::: fruit2 : " + fruit5 )

    // use two lists with Set.:::() method
    fruit5 = fruit3.:::(fruit4)
    println( "fruit1.:::(fruit2) : " + fruit5 )

    // pass two or more lists as arguments
    fruit5 = List.concat(fruit3, fruit4)
    println( "List.concat(fruit1, fruit2) : " + fruit5  )

    //创建统一列表,可以使用List.fill()方法创建由零个或多个相同元素的副本组成的列表。 请尝试以下示例程序。
    fillTest()
    //制表函数:您可以使用一个函数与List.tabulate()方法在列表之前应用于列表的所有元素。它的参数与List.fill类似：第一个参数列表给出要创建的列表的维度，第二个参数列出了列表的元素。唯一的区别是，它不修复元素，而是从函数中计算。
    tabulateTest()
    //反向列表顺序
    println(fruit.reverse)
  }
  def fillTest(): Unit ={
    val fruit = List.fill(3)("apples") // Repeats apples three times.
    println( "fruit : " + fruit  )

    val num = List.fill(10)(2)         // Repeats 2, 10 times.
    println( "num : " + num  )
  }
  def tabulateTest(): Unit ={
    // Creates 5 elements using the given function.
    val squares = List.tabulate(6)(n => n * n)
    println( "squares : " + squares  )

    val mul = List.tabulate( 4,5 )( _ * _ )
    println( "mul : " + mul  )

  }
}
