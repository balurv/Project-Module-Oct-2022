package org.example.concurrency.thread;

public class MultiThread extends Thread{
    public  void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        MultiThread m1 = new MultiThread();
        MultiThread m2 = new MultiThread();
        MultiThread m3 = new MultiThread();
        m1.start();
        m2.start();
        m3.start();

    }
}
