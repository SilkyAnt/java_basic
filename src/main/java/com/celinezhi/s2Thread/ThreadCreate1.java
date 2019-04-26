package com.celinezhi.s2Thread;

/**
 * @functon 多线程学习
 * @time 2015.3.9
 * @desc 通过Thread的方式来穿件多线程
 */
class ThreadCreate1 extends Thread {
    private String name;

    public ThreadCreate1(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadCreate1 mTh1 = new ThreadCreate1("A");
        ThreadCreate1 mTh2 = new ThreadCreate1("B");
        mTh1.start();
        mTh2.start();
    }
}