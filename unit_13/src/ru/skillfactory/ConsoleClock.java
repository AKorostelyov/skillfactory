package ru.skillfactory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class ConsoleClock extends Thread {
    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        while (!isInterrupted()) {
            System.out.println(simpleDateFormat.format(new Timestamp(System.currentTimeMillis())));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The clock was stopped");
                break;
            }
        }
    }
}
