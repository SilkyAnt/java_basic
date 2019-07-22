package com.celinezhi.s1Class;

public class Reflection {
    // 参考文章：java 反射（特别通俗易懂）
    // https://blog.csdn.net/lwl20140904/article/details/80163880
    // 为什么要用反射机制
    // https://www.cnblogs.com/yrstudy/p/6500982.html

    public static void main(String[] args) {
        // 第一种方式获取 Class 对象
        Reflection reflection1 = new Reflection();// 这一 new 产生一个 Reflection 对象，一个 Class 对象。
        Class testClass = reflection1.getClass();// 获取 Class 对象
        System.out.println(testClass.getName());

        // 第二种方式获取 Class 对象
        Class testClass2 = Reflection.class;
        System.out.println(testClass == testClass2);// 判断第一种方式获取的 Class 对象和第二种方式获取的是否是同一个

        // 第三种方式获取 Class 对象
        try {
            Class testClass3 = Class.forName("com.celinezhi.s1Class.Reflection");// 注意此字符串必须是真实路径，就是带包名的类路径，包名。类名
            System.out.println(testClass3 == testClass2);// 判断三种方式是否获取的是同一个 Class 对象
        } catch (
                ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Object test=testClass2.newInstance ();// 创建对象的实例
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
