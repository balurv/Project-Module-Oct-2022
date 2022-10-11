package org.example.concurrency.runnable;

public class MultiThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        MultiThread m1 = new MultiThread();
        MultiThread m2 = new MultiThread();
        MultiThread m3 = new MultiThread();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        t1.start();
        t2.start();
        t3.start();

    }
}
