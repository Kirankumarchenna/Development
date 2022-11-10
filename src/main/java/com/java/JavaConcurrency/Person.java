package com.java.JavaConcurrency;

public class Person implements Runnable{
    String message;
    public void setMessage(String message){
        this.message= message;
    }

    public void unwrappingMsg(){
        for(char ch: message.toCharArray()){
            System.out.print(ch);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                 e.getMessage();
            }
        }
    }
    public void run(){
        unwrappingMsg();
        System.out.println();
        System.out.println("This is working under the thread: "+Thread.currentThread().getName());
    }
}
