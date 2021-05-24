package ru.skillfactory;

public class Main {

    private final static String WORLD_TIME = "EEE MMM dd HH:mm:ss z yyyy";
    private final static String LOCAL_TIME = "yyyy MMM dd HH:mm:ss";
    public static void main(String[] args) {
        Time time = new Time();
        time.getTime(WORLD_TIME);
        time.getTime(LOCAL_TIME);

        int a = -6, b = -3;

        System.out.println(abs(a));
        System.out.println(max(a, b));
        System.out.println(min(a, b));
    }

    public static double abs(double num) {
        return Math.abs(num);
    }

    public static int max(int a, int b) {
        return Math.max(a,b);}

    public static int min(int a, int b) {
        return Math.min(a,b);
    }
}
