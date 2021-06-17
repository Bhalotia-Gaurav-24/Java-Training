package com.pwc.blockingdatastructure;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> bq = new ArrayBlockingQueue<>(3);
        bq.put("v1");
        bq.put("v2");
        bq.put("v3");

        System.out.println("Before adding 4th value");

        new Thread() {
            @Override
            public void run() {



                try {
                    Thread.sleep(5000);

                    System.out.println(bq.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }.start();

        bq.put("v4");

        System.out.println("After added 4th value...");




    }
}

