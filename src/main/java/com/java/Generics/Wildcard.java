package com.java.Generics;

import java.util.Arrays;
import java.util.List;

public class Wildcard {
    public static List show(List<?> list){
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        System.out.println(show(list));

        List<String> list1 = Arrays.asList("Generics", "Concept", "is too good");
        System.out.println(show(list1));

        List<Double> list2 = Arrays.asList(9.1, 8.6, 7.3);
        System.out.println(show(list2));
    }
}
