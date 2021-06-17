package com.pwc.reactiveprogramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ReactiveCodeWithCompletableFuture {




    public static void main(String[] args) throws ExecutionException, InterruptedException {


        CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(() -> {

            /**
             * REST API Google Distance API
             */
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("this task is executing in : " + Thread.currentThread().getName());

            return 5;
        });

        // Blocking...
//        Integer i = cf.get();
//        System.out.println("The value :  " + i);


        // Non Blocking
        cf.whenComplete((x, y) -> {

            if ( y == null) {
                System.out.println(".........the value is  : " + x);
            } else {
                System.out.println(y.getMessage());
            }

        });

        System.out.println("When do I reach here...");

        Thread.sleep(5000);


    }

}
