package com.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet hashSet = new LinkedHashSet();
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("D");
        hashSet.add(null);
        hashSet.add(10);
        hashSet.add(20);
        System.out.println(hashSet);
        System.out.println(hashSet.getClass().getName());
        System.out.println(hashSet.add("B"));
    }
}
