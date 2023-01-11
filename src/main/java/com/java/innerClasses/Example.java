package com.java.innerClasses;

public class Example {
    int i = 10;
    public void m1(){

        class Dummy {
            public void m2() {
                System.out.println(i);
            }
        }
        Dummy dummy = new Dummy();
        dummy.m2();
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.m1();
    }
}
