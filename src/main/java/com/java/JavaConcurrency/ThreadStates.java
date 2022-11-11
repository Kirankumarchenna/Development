package com.java.JavaConcurrency;

public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
           for(int i=0 ;i<=10; i++){
               System.out.println(i);
           }
        });
        thread.start();
        System.out.println(thread.getState());
    }
}
