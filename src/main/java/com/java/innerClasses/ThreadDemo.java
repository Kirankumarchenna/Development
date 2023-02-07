package com.java.innerClasses;

public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(() ->  System.out.println("child Thread")).start();
        for(int i=0; i<10;i++){
            System.out.println("Main thread");
        }
    }
}
