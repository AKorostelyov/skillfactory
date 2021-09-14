package ru.skillfactory;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        //loadingThread();
        // synchronizedOutput();
        Task1433.start();
    }

    public static void synchronizedOutput() {
        new Typer("Message first. ").start();
        new Typer("Message second. ").start();
    }
    public static void loadingThread() {
        Thread thr = new Thread(new LoadingThread());
        try {
            thr.start();
            thr.join();
            System.out.println("Images are loaded");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
