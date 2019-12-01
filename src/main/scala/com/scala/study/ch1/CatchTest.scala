package com.scala.study.ch1

import java.io.{FileNotFoundException, FileReader, IOException}

import scala.collection.mutable.ArrayBuffer


object CatchTest {

  def main(args: Array[String]): Unit = {
    try {
      val arrB = ArrayBuffer(1, 2, 3)
      arrB.insert(2,60,40)
      print(arrB)
    } catch {
      case ex: FileNotFoundException =>
      //文件不存在的时候操作
      case ex: IOException =>
      //I/O错误时操作
    } finally {

    }
  }

}
