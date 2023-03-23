package com;

public class DeadThreadTest {

    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        Thread r1 = new Thread(r, "线程1");
        Thread r2 = new Thread(r, "线程2");

        r1.start();
        r2.start();
    }
}

class DeadThread{
    static{
        if (true){
            System.out.println(Thread.currentThread().getName() + "初始化当前类");
            while (true){

            }
        }
    }
}