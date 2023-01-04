package com.java.JavaConcurrency;

public class ThreadWaitState {
    public static void main(String[] args) throws InterruptedException {
        Object key = new Object();
        Runnable runnable = ()-> {
            synchronized (key){
                System.out.println("Initial Lock");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        synchronized (key) {
            for (int i=0;i<=10;i++){
                System.out.print(i);
                System.out.println();
                System.out.println(thread.getState());
                try {
                    while (i==5){
                        key.wait();
                        System.out.println(thread.getState());
                    }
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
