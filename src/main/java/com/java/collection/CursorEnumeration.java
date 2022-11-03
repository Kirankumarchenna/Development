package com.java.collection;

import java.util.Enumeration;
import java.util.Vector;

public class CursorEnumeration {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0; i<=10; i++){
            v.addElement(i);
        }
        System.out.println(v);
        /**
         * So here this will print all the objects at a time which are present in Vector as we
         * added int vector by using loops
         * Note: So we don't need all the elements at a time, we need to retrieve the elements one by one
         *       using Cursors.
         *       So, below I have used Enumeration cursor
         */
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            Integer i =(Integer) e.nextElement();
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println(e.getClass().getName());
    }
}
