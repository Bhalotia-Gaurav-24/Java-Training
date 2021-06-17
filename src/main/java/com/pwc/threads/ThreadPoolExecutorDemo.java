package com.pwc.threads;


import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {


    public static void main(String[] args) {


        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("This task is executing in : " + Thread.currentThread().getName());
            }
        });

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        scheduledExecutorService.scheduleAtFixedRate(() -> {

            System.out.println("This will execute after 5 seconds....");

        }, 5, 1, TimeUnit.SECONDS);


    }
}


class MyTimerClass extends Timer {


    public void run() {

        this.cancel();

    }


}
