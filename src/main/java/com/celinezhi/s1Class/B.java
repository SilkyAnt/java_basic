package com.celinezhi.s1Class;

class A {
    public int i = method();
    public static int j = method2();
    public int k = 0;

    public A() {
        System.out.println(1);
    }

    public int method() {
        System.out.println(2);
        return 2;
    }

    public static int method2() {
        System.out.println(3);
        return 3;
    }
}

public class B extends A {
    public int m = method3();
    public static int n = method4();
    public int t = 0;

    public B() {
        System.out.println(4);
    }

    public int method3() {
        System.out.println(5);
        return 5;
    }

    public static int method4() {
        System.out.println(6);
        return 6;
    }

    public static void main(String[] args) {
        System.out.println(7);
        A a = new B();
    }
}