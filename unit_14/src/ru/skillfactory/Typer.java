package ru.skillfactory;

public class Typer extends Thread {
    static Object object = new Object();
    String msg;

    public Typer(String msg) {
        this.msg = msg;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < msg.length(); i++) {
            System.out.print(msg.charAt(i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
