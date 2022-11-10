package com.java.JavaConcurrency;


public class MessageForAPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setMessage("This is a message to a person.....");
        Thread thread = new Thread(person);
        thread.setName("Thread1");
        thread.start();
    }
}
