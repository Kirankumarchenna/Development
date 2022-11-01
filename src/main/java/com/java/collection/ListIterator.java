package com.java.collection;

import java.util.LinkedList;
import java.util.*;

public class ListIterator {
    public static void main(String[] args) {
      List list = new LinkedList();
      list.add("Obulesh");
      list.add("Kiran");
      list.add("Durga");
      list.add("Madhuri");
      list.add("Poojitha");
      System.out.println(list);
        java.util.ListIterator ltr = list.listIterator();
        while(ltr.hasNext()){
            String s =(String) ltr.next();
            if(s.equals("Obulesh")){
                ltr.remove();
                ltr.add("Magam");
            } else if (s.equals("Kiran")){
                ltr.set("Chenna");
            } else if(s.equals("Durga")){
                ltr.set("Geddads");
            }
        }
        System.out.println(""+list);
        List<Integer> list1 = Arrays.asList(12, 13, 14, 15, 16);
        System.out.println(list1);
        java.util.ListIterator lt = list1.listIterator();
        while(lt.hasNext()){
            Integer i = (Integer)lt.next();
            System.out.println(i);
        }
        while (lt.hasPrevious()){
            System.out.println(lt.previous());
        }

    }

}
