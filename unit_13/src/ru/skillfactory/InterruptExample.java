package ru.skillfactory;

public class InterruptExample {
    public static void interruptTest() throws InterruptedException { // 4
        Thread threadToInterrupt = new Thread(() -> {
            while (true) {
                System.out.println("Working hard");
            }
        });
        threadToInterrupt.start();
        Thread.currentThread().sleep(2500); // 3
        threadToInterrupt.interrupt(); // 5
    }
}

