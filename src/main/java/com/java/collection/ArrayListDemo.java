package com.java.collection;

import java.io.Serializable;
import java.util.*;

public class ArrayListDemo {
    public static void main (String[] args){
        ArrayList l = new ArrayList();
        l.add("K");
        l.add(10);
        l.add("k");
        l.add(10);
        l.add(null);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2,"M");
        System.out.println(l);
        l.add("N");
        System.out.println(l);

        System.out.println();

        ArrayList list = new ArrayList();
        Vector v = new Vector();
        v.add(0, "kiran");
        System.out.println(v);
        LinkedList linkedList = new LinkedList();
        System.out.println(list instanceof Serializable);
        System.out.println(linkedList instanceof Cloneable);
        System.out.println(list instanceof RandomAccess);
        System.out.println(linkedList instanceof RandomAccess);

        ArrayList l1 = new ArrayList();         //Non Synchronized
        List l2 = Collections.synchronizedList(l1); //Synchronized

        System.out.println("--------------------------------");
        /**
         * Below I have used iterator cursor to iterator Cursor to retrieve the elements
         * int the collection
         */
        ArrayList l3 = new ArrayList();
        for(int i=0; i<=10; i++){
            l3.add(i);
        }
        Iterator itr = l3.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
