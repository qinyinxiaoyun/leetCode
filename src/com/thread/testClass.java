package com.thread;

/**
 * 父类子类调用顺序：父类静态（属性+代码块）>子类静态（属性+代码块）>父类非静态>父类构造器>子类非静态>子类构造器
 * 再次加载不再调用静态属性与代码块
 * 初始化与声明类型无关，只与实际类型有关
 */
public class testClass {
    static class A {

        static {
            System.out.println("A static");
        }

        {
            System.out.println("AAA");
        }

        public A() {
            System.out.println("A init");
        }
        static Hi hi = new Hi("A");

        Hi hi2 = new Hi("A2");
    }


    static class B extends A {

        static {
            System.out.println("B static");
        }

        {
            System.out.println("BBB");
        }
        static Hi hi = new Hi("B");

        Hi hi2 = new Hi("B2");

        public B() {
            System.out.println("B init");
        }
    }

    static class Hi {
        public Hi(String str) {
            System.out.println("Hi " + str);
        }
    }

    public static void main(String[] args) {
        System.out.println("初次 new B：");
        A b = new B();
        System.out.println();
        System.out.println("第二次 new B：");
        B a = new B();
    }
}
