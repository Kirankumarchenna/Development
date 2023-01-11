package com.java.innerClasses;

public class AnonymusInnerClass {
    public void run(){
        System.out.println("Main visible class is running");
    }
}
class Test1{
    public static void main(String[] args){
        AnonymusInnerClass anonymusInnerClass = new AnonymusInnerClass(){
          public void run(){
              System.out.println("RealAnonymus class is running");
          }
        };
        anonymusInnerClass.run();
        AnonymusInnerClass anonymusInnerClass1 = new AnonymusInnerClass(){
            public void run(){
                System.out.println("This is the second real anonymus class");
            }
        };
        anonymusInnerClass1.run();
        AnonymusInnerClass anonymusInnerClass2 = new AnonymusInnerClass();
        anonymusInnerClass2.run();
    }
}
