package com.java.JavaConcurrency;


public class ThreadBlockState {
    public static void main(String[] args) {
        Object key = new Object();
        Thread thread = new Thread(()->{
           synchronized (key){
               System.out.println("Locked");
           }
        });
        System.out.println(thread.getState());

        synchronized (key){
            thread.start();
            System.out.println(thread.getState());
            while(thread.getState() != Thread.State.BLOCKED){
                System.out.println("Realeasing lock");
            }
            System.out.println(thread.getState());
        }
    }
}
