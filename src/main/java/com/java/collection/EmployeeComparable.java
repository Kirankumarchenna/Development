package com.java.collection;

import java.util.TreeSet;

public class EmployeeComparable {
    String name;
    int id;
    EmployeeComparable(String name, int id){
        this.name = name;
        this.id = id;
    }

}

class ComparableComparator{
    public static void main(String[] args) {
        EmployeeComparable e1 = new EmployeeComparable("Kiran", 1);
        EmployeeComparable e2 = new EmployeeComparable("Kumar", 2);
        EmployeeComparable e3 = new EmployeeComparable("Chenna", 3);
        TreeSet treeSet = new TreeSet();
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        System.out.println(treeSet);

        /*TreeSet treeSet1 = new TreeSet(new MyComparator5());
        treeSet1.add(e1);
        treeSet1.add(e2);
        treeSet1.add(e3);
        System.out.println(treeSet1);*/
    }
}

/*class MyComparator5 implements Comparator {
    public int compare(Object obj1, Object Obj2){
        EmployeeComparable e1 = (EmployeeComparable) obj1;
        EmployeeComparable e2 = (EmployeeComparable)Obj2;
        int i1 = e1.id;
        int i2 = e2.id;
        if(i1<i2){
            return +1;
        } else if(i1>i2){
            return -1;
        } else {
            return 0;
        }

    }
}*/
