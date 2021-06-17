package com.pwc.threads;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolDemo {


    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = new ForkJoinPool();


        forkJoinPool.execute(new RecursiveTask<Integer>() {
            @Override
            protected Integer compute() {

//                ForkJoinTask.in

                return 5;

            }
        });


    }
}

