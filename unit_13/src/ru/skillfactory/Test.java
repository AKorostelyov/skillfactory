package ru.skillfactory;

public class Test extends Thread{
    String str;

    public Test(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.print(str);
    }
}
