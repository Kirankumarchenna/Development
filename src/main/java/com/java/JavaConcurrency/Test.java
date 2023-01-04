package com.java.JavaConcurrency;

public class Test {
    private static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
            System.out.println(Thread.currentThread().getName());
        }
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        MyThread myThread = new MyThread("myThread");
        System.out.println(myThread.getName());
        myThread.run();
    }
}