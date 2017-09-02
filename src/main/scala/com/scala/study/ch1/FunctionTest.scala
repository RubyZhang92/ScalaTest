package com.scala.study.ch1

import java.util.Date

/**
  * Description:函数使用
  * Author:lujinyong
  * Date:2017/9/2 21:00
  */
object FunctionTest {

  def main(args: Array[String]): Unit = {
    //按名称调用函数
    delayed(time())
    //命名参数的函数:命名参数允许您以不同的顺序将参数传递给函数,语法只是每个参数前面都有一个参数名称和一个等号
    printInt(b = 5, a = 7)
    //可变参数的函数
    printStrings("Hello", "Scala", "Python")
    //递归函数
    for (i <- 1 to 10)
      println( "Factorial of " + i + ": = " + factorial(i) )
    //默认值函数
    println( "Returned Value : " + addInt() )
    //高阶函数
    println( apply( layout, 10) )
    //匿名函数
    println(inc(7)-1)
    println(mul(3, 4))
    println( userDir )
    //柯里化(Currying)函数
    val str1:String = "Hello, "
    val str2:String = "Scala!"
    println( "str1 + str2 = " +  strcat(str1)(str2) )
    //嵌套函数
    println( factorial(0) )
    println( factorial(1) )
    println( factorial(2) )
    println( factorial(3) )

    //部分应用函数
    val date = new Date
    val logWithDateBound = log(date, _ : String)
    logWithDateBound("message1" )
    Thread.sleep(1000)
    logWithDateBound("message2" )
    Thread.sleep(1000)
    logWithDateBound("message3" )
  }
  def time() = {
    println("Getting time in anao seconds")
    System.nanoTime
  }
  def delayed(t: => Long) = {
    println("In delayed method")
    println("param:"+t)
  }
  def printInt( a:Int, b:Int ) = {
    println("Value of a : " + a )
    println("Value of b : " + b )
  }
  def printStrings( args:String* ) = {
    var i : Int = 0

    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg )
      i = i + 1;
    }
  }
  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }
  def addInt( a:Int = 5, b:Int = 7 ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"

  //定义具有1个参数的函数
  var inc = (x:Int) => x+1
  //定义具有多个参数的函数
  var mul = (x: Int, y: Int) => x*y
  //定义不带参数的函数
  var userDir = () => { System.getProperty("user.dir") }


  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }

  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }
}
