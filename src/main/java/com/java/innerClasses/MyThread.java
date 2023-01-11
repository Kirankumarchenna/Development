package com.java.innerClasses;

public class MyThread extends Thread{
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        });
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
