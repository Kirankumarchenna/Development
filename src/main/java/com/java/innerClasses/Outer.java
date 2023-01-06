package com.java.innerClasses;

public class Outer {
    class Inner{
       public void m1(){
           System.out.println("Inner one");
       }
    }
    public void m2(){
        Inner inner = new Inner();
        inner.m1();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m2();
    }

}
