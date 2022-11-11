package com.java.JavaConcurrency;

public class ThreadBlockedState {
    public static void main(String[] args) throws InterruptedException {
        Object key = new Object();
        Thread thread = new Thread(()->{
            for(int i=0; i<=5; i++){
                System.out.print(i);
            }
        });
        thread.start();
        synchronized (key){
            if(thread.getState() == Thread.State.RUNNABLE) {
                System.out.println(thread.getState());
            }
            System.out.println(thread.getState());
        }
    }

}