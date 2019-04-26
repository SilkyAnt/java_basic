# 课程链接
    深入浅出Java多线程
    https://www.imooc.com/learn/202
### base
* 线程的简单创建
    * Runnable
    * Thread
### concurrent
* 隋唐军队
    * 线程正确的退出方式：推荐使用退出标志
        * 如：隋唐军队中的keepRunning
    * 错误的退出方式：
        * 使用interrupt()方法
### racecondition
* 争用条件：能量守恒
    * 线程交互
    * 互斥与同步
        * 互斥使用 synchronize 实现
        * 同步使用 wait()/notify()/notifyAll()
        
### 学到了什么
* 如何创建线程及线程的基本操作
* 可见性及volatile关键字
* 争用条件
* 线程的互斥synchronized
* 线程的同步wait/notifyAll
    * 同步的三个方法是对象的方法，不是线程的方法
    * 参考资料：https://www.cnblogs.com/lirenzhujiu/p/5927241.html
    
### 今后多线程的进阶
* Java Memory Mode 
    * JMM 描述了java线程如何通过内存进行交互
    * happens-before原则
    * synchronized，volatile & final
* Locks & Condition
    * java 锁机制和等待条件的高层实现
    * java.util.concurrent.locks
* 线程安全性
    * 原子性与可见性
    * java.util.concurrent.atomic
    * synchronized & volatile
    * DeadLocks
* 多线程编程的交互模型
    * Producer-Consumer 模型
    * Read-Write Lock 模型
    * Future模型
    * Worker Thread 模型
* Java5中并发编程工具
    * java.util.concurrent
    * 线程池ExecutorService
    * Callable & Future
    * BlockingQueue 
* 书籍推荐
    * Core Java 
    * Java Concurrency In Practice          