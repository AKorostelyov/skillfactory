package ru.skillfactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable {
    private Socket socket;
    private String name;
    private InputStream is;
    private OutputStream os;

    public Client(Socket socket) throws IOException {
        this.socket = socket;
        this.is = socket.getInputStream();
        this.os = socket.getOutputStream();
    }

    public void run() {
        try {
            Scanner in = new Scanner(is);
            PrintStream out = new PrintStream(os);
            // читаем из сети и пишем в сеть
            out.println("Welcome to room!");
            out.println("Please name yourself");
            String input = in.nextLine();
            name = input;
            out.println("Henlo, " + name);
            Server.sendWelcomeMsg(name);
            input = in.nextLine();
            while (!input.equals("bye")) {
                Server.sendMsgToAll(input, name);
                input = in.nextLine();
            }
            out.println("You left room");
            socket.close();
            Server.sendExitMsg(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(String msg) {
        PrintStream out = new PrintStream(os);
        out.println(msg);
    }
}
