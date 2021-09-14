package ru.skillfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOneThread {

    public void oneThread() {
        long start = System.currentTimeMillis();

        // 1 часть

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            numbers.add(i);
        }
        int max = Collections.max(numbers);
        System.out.println("Max found: " + max);

        // 2 часть

        List<Integer> unsorted = new ArrayList<>();
        for (int i = 10000000; i >= 1; i--) {
            unsorted.add(i);
        }
        Collections.sort(unsorted);
        System.out.println("List is sorted now");

        // 3 часть

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }
        while (list.size() != 0) {
            list.remove(list.size() - 1);
        }
        System.out.println("List cleared");

        // Итог

        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start) + " ms");
    }

    public void fewThreads() throws InterruptedException {
        long start = System.currentTimeMillis();

        // 1 часть
        Thread thread1 = new Thread(() -> {
            long start1 = System.currentTimeMillis();
            List<Integer> numbers = new ArrayList<>();
            for (
                    int i = 1;
                    i <= 10000000; i++) {
                numbers.add(i);
            }

            int max = Collections.max(numbers);
            long end1 = System.currentTimeMillis();
            System.out.println("Max found: " + max + ", for " + (end1-start1) + " ms");
        });
        Thread thread2 = new Thread(() -> {
            long start2 = System.currentTimeMillis();
            List<Integer> unsorted = new ArrayList<>();
            for (int i = 10000000; i >= 1; i--) {
                unsorted.add(i);
            }
            Collections.sort(unsorted);
            long end2 = System.currentTimeMillis();
            System.out.println("List is sorted now for " + (end2 - start2) + " ms");
        });

        // 2 часть

        Thread thread3 = new Thread(() -> {
            long start3 = System.currentTimeMillis();
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= 10000000; i++) {
                list.add(i);
            }
            while (list.size() != 0) {
                list.remove(list.size() - 1);
            }

            long end3 = System.currentTimeMillis();
            System.out.println("List cleared for " + (end3 - start3) + " ms");
        });

        // 3 часть



        // Итог

        thread1.start();
        thread2.start();
        thread3.start();


        thread1.join();
        thread2.join();
        thread3.join();
        long end = System.currentTimeMillis();

        System.out.println("Total time: " + (end - start) + " ms");
    }
}
