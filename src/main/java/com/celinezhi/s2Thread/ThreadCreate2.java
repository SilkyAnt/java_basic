package com.celinezhi.s2Thread;

/**
 * @desc 通过实现Runnable接口来创建多线程
 */
public class ThreadCreate2 implements Runnable {
    private String name;

    public ThreadCreate2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadCreate2("C")).start();
        new Thread(new ThreadCreate2("D")).start();
    }

}
