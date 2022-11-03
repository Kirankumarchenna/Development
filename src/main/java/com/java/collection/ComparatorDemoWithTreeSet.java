package com.java.collection;

import sun.reflect.generics.tree.Tree;

import javax.jws.Oneway;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemoWithTreeSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(32);
        t.add(25);
        t.add(10);
        t.add(5);
        t.add(3);
        t.add(21);
        System.out.println(t);

        TreeSet t1 = new TreeSet(new MyComparator1());
        t1.add("Kiran");
        t1.add("Kumar");
        t1.add("Sujatha");
        t1.add("Rajini");
        t1.add("Achiyamma");
        System.out.println(t1);
    }
}

class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;
       /*
       if(i1<i2){
            return +1;
        } else if(i1>i2){
            return -1;
        } else {
            return 0;
        }
        */
        return -i1.compareTo(i2);
    }
}

class MyComparator1 implements Comparator{
    public int compare(Object obj1, Object obj2){
        String s1 = (String) obj1;
        String s2 = obj2.toString();
        return s1.compareTo(s2);
    }
}
