package com.pwc.reactiveprogramming;

import java.util.concurrent.*;

public class ReactiveDemo {



    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread t1 = new Thread() {
            @Override
            public void run() {

                // invoke web service REST API
                //
            }
        };

        t1.start();
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Integer> futureObject = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // REST API
                Thread.sleep(5000);
                return 50;
            }
        });
        System.out.println("in main....");

        // blocking call
        Integer value = futureObject.get();
        System.out.println(value);



    }
}
