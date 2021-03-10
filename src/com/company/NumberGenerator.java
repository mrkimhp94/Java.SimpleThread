package com.company;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i +",");
            }
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.getStackTrace();
        }finally {
            System.out.println("success!");
        }
    }
}
