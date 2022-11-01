package com.java.collection;

import java.util.ArrayList;
import java.util.*;

public class CursorIterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        for(int i=1; i<=10; i++) {
            list.add(i);
        }
        System.out.println("This is the entire List collection: "+list);
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            Integer j = (Integer) itr.next();
           /* System.out.println(j);
               if(j>=5){
                    break;
               }*/
            if(j%2==0){
                if(j==6){
                    itr.remove();
                } else {
                    System.out.println(j);
                }
            } else {
                itr.remove();
                /*
                    so here this remove method removes all the odd numbers
                 */
            }
        }
    }
}
