package ru.skillfactory;

public class Main {

    public static void main(String[] args) {
        task261();
        System.out.println("---------------------------------------");
        task263();
        System.out.println("---------------------------------------");
        task266();
        System.out.println("---------------------------------------");
        task267();
        System.out.println("---------------------------------------");
    }

    public static String decode(char ch) {
        switch (ch) {
            case 'h':
                return "Hello world";
            case 'i':
            case 'm':
            case 'k':
                return "I can decode";
            default:
                return "I don't know this symbols! Please input as human, not alien";
        }
    }

    public static void task261() {
        System.out.println("***Task 2.6.1 started***");
        char ch1 = 'h';
        char ch2 = 'k';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static void task263() {
        System.out.println("***Task 2.6.3 started***");
        int i=10;
        do {
            System.out.println("Value i= " + i--);
        } while (i>1);

        System.out.println("Final i value is " + i);
    }

    public static void task266() {
        System.out.println("***Task 2.6.6 started***");
        int variable = 7;
        System.out.println((variable>10)?variable-10:variable+10);
    }

    public static void task267() {
        System.out.println("***Task 2.6.7 started***");
        int sum = 10;
        for (int i = 10; i < 100; i = i + 10) {
            sum += i;
        }
        System.out.println(sum);
    }
}
