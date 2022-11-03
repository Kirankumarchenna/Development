package com.java.collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("E");
        treeSet.add("D");
        treeSet.add("B");
        System.out.println(treeSet);
        /**
         * Below code is to demonstrate that we cant perform the adding of the elements with
         * the string buffer object
         */
        /*treeSet.add(new StringBuffer("K"));
        treeSet.add(new StringBuffer("D"));
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("F"));
        treeSet.add(new StringBuffer("C"));
        System.out.println(treeSet);*/
        /*
            Below example is for comparable Interface methods
         */
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("A"));
        System.out.println("A".compareTo("A"));
    }
}
