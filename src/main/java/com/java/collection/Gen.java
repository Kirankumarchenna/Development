package com.java.collection;

public class Gen<T>{
    T obj;
    Gen(T obj){
        this.obj = obj;
    }
    public void show(){
        System.out.println("This Obj parameter is: "+ obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }

    public static void main(String[] args) {
        Gen<String> gen = new Gen<String>("Generic");
        gen.show();
        System.out.println("The value which is present in the object obj is: "+gen.getObj());

        Gen<Double> gen1 = new Gen<Double>(10.6);
        gen1.show();
        System.out.println("The value which is present in the object obj is: "+gen1.getObj());

        Gen<Integer> gen2 = new Gen<>(89);
        gen2.show();
        System.out.println("The value which is present in the object obj is: "+gen2.getObj());
    }
}
