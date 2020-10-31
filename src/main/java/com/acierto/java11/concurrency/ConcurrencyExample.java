package com.acierto.java11.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrencyExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Runnable task = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Future<String> future = executorService.submit(task, "Goodbye");
        System.out.println(future.get());
        executorService.shutdownNow();
    }
}
