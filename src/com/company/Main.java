package com.company;

public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator);
        thread1.start();
        thread1.setPriority(1);
        thread2.start();
        thread2.setPriority(10);
    }
}
