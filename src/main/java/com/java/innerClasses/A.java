package com.java.innerClasses;

public class A {
    static class B{
        static class C{
            public void main(){
                System.out.println("Innermost class");
            }
        }
    }
}
class Test{
    public static void main(String[] args) {
        A.B.C c = new A.B.C();
        c.main();
    }
}

