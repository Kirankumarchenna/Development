package com.java.JavaConcurrency;

public class PrintBanner {
    public static void main(String[] args) throws InterruptedException {
        String message = "Hello all ";
        Thread thread = new Thread(() -> {
            for(int i=0; i<=10; i++){
                System.out.print(i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        thread.join();
        System.out.println();

        Runnable runnable = () -> {
            for(char ch: message.toCharArray()){
                System.out.print(ch);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.setDaemon(false); //This makes the child thread to terminate and the parent to work
        thread1.start();
        thread1.join();
        System.out.println();
        System.out.println("End of this thread");
    }
}
