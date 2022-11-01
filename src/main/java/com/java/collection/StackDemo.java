package com.java.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack);
        System.out.println(stack.search("B"));
        System.out.println(stack.search("A "));
        System.out.println(stack.search("C"));
        System.out.println(stack.empty());

    }
}
