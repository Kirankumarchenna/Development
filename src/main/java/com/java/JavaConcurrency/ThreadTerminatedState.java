package com.java.JavaConcurrency;

public class ThreadTerminatedState {
    public static void main(String[] args) throws InterruptedException {
        Object key = new Object();
        Runnable runnable = ()-> {

        };
        synchronized (key) {
            Thread thread = new Thread(runnable);
            thread.start();
            while(thread.getState() != Thread.State.TERMINATED){
                thread.interrupt();
            }
            System.out.println(thread.getState());
        }
    }
}
