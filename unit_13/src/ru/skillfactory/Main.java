package ru.skillfactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {
        //someThreadPlay();
        Server server = new Server(1234);
        server.run();
    }

    public static void someThreadPlay() {
        Test t1 = new Test("Thread1");
        Test t2 = new Test("Thread2");
        Test t3 = new Test("Thread3");
        t1.start();
        t3.run(); // 1
    }
}
