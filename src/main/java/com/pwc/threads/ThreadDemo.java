package com.pwc.threads;

import java.util.Random;

public class ThreadDemo{

        public static void main(String[] args) {

            System.out.println(Runtime.getRuntime().availableProcessors());

            VacationThread t1 = new VacationThread("Dubai");
            VacationThread t2 = new VacationThread("London");
//        t1.start();
//        t2.start();

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
            Runnable r = () -> {
                System.out.println("In Thread : " + Thread.currentThread().getName());
            };

            Thread t3 = new Thread(r);

            t3.start();
        }
}

class VacationThread extends Thread {

    private String destination;
    Random r = new Random();

    public VacationThread(String destination) {
        this.destination = destination;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            long sleepTime = r.nextInt(1000);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am going to : " + this.destination + " -- reported by " + Thread.currentThread().getName());
        }
    }
}
