package com.scala.study.ch1

/**
  * Description:私有成员
  * Author:lujinyong
  * Date:2017/8/26 22:20
  */
class Outer {
  class Inner {
    //私有成员只能看到里面包含的成员定义的类或对象
    private def f() { println("f") }
    class InnerMost {
      f() // OK
    }
  }
  //在Scala中，访问 (new Inner).f() 是非法的，因为f被声明为private内部类并且访问不是在内部类内。与此相反，到f第一接入类最内层是确定的，因为该访问包含在类内的主体。 Java将允许这两种访问，因为它可以让其内部类的外部类访问私有成员。
//  (new Inner).f() // Error: f is not accessible
}

/**
  * 保护成员
  */
//受保护的成员是从该成员定义的类的子类才能访问。下面是一个例子：
class Super {
  protected def f() { println("f") }
}
class Sub extends Super {
  f()
}
//类分给 f 访问是正常的，因为f被声明为受保护的超类和子类是超级的子类。相比之下，访问 f 在其他是不允许的，因为其他没有从超级继承。在Java中，后者访问将仍然允许的，因为其他的是在同一个包。
class Other {
//  (new Super).f() // Error: f is not accessible
}

/**
  * 公共成员
  */
//未标示私有或受保护的每一个成员是公开的。不需要明确使用修饰符public。这样的成员可以从任何地方访问。下面是一个例子：
class Outer1 {
  class Inner {
    def f() { println("f") }
    class InnerMost {
      f() // OK
    }
  }
  (new Inner).f() // OK because now f() is public
}

/**
  * 保护范围
  */
package society {
  package professional {
    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secrets = null

      def help(another : Executive) {
        println(another.workDetails)
//        println(another.secrets) //ERROR
      }
    }
  }
}