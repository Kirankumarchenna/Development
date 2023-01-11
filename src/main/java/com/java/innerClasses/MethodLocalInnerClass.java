package com.java.innerClasses;

public class MethodLocalInnerClass {
    public void m1() {
        class Add {
            int sum = 0;
            public void addition(int x, int y) {
                System.out.println("Sum: "+(sum = x+y));
            }
        }
        Add add = new Add();
        add.addition(23, 45);
        add.addition(34, 89);
        add.addition(89, 43);
    }
    public static void main(String[] args) {
        MethodLocalInnerClass methodLocalInnerClass = new MethodLocalInnerClass();
        methodLocalInnerClass.m1();
    }
}

