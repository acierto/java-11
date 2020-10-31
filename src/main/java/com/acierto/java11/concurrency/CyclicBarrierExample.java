package com.acierto.java11.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        Runnable barrierExample = () -> System.out.println("Barrier");
        CyclicBarrier barrier = new CyclicBarrier(2, barrierExample);
        Runnable task1 = () -> {
            try {
                barrier.await();
                System.out.println("Task 1");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };
        Runnable task2 = () -> {
            try {
                System.out.println("Task 2");
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        };
        new Thread(task1).start();
        new Thread(task2).start();
    }
}
