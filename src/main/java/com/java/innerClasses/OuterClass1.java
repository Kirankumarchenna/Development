package com.java.innerClasses;

public class OuterClass1 {
    int x = 10;
    class InnerClass{
        int x = 100;
        public void m1(){
            int x = 1000;
            System.out.println("m1 method variable: "+x);
            System.out.println("Inner Class Variable: "+this.x);
            System.out.println("Outer Class Variable: "+OuterClass1.this.x);
        }
    }

    public static void main(String[] args) {
        new OuterClass1().new InnerClass().m1();
    }
}
