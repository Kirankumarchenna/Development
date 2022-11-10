package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator4());
        t.add("AA");
        t.add(new StringBuffer("XXXX"));
        t.add("C");
        t.add(new StringBuffer("ADC"));
        System.out.println(t);
    }
}
class MyComparator4 implements Comparator{
    public int compare(Object obj1, Object obj2){
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2){
            return +1;
        } else if(l1<l2){
            return -1;
        } else {
            return 0;
        }
    }

}

