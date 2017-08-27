package com.scala.study.ch1

import scala.util.control.Breaks

/**
  * Description:
  * Author:lujinyong
  * Date:2017/8/27 21:48
  */
object BreakTest {
  def main(args: Array[String]): Unit = {
    var a = 0;
    var b = 0;
    val numList1 = List(1, 2, 3, 4, 5);
    val numList2 = List(11, 12, 13);

    val outer = new Breaks;
    val inner = new Breaks

    outer.breakable {
      for (a <- numList1) {
        println("Value of a: " + a);
        inner.breakable {
          for (b <- numList2) {
            println("Value of b: " + b);
            if (b == 12) {
              inner.break;
            }
          }
        } // inner breakable
      }
    } // outer breakable.
  }
}

