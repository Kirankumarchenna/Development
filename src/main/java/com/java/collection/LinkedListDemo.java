package com.java.collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Kiran");
        l.add(40);
        l.add(null);
        System.out.println(l);
        l.set(1,"Kumar");
        System.out.println(l);
        l.add(2, "Chenna");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst("Samuel");
        System.out.println(l);
    }
}
