package ru.skillfactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    private static ArrayList<Client> clients = new ArrayList<>();
    private ServerSocket serverSocket;

    public Server(int port) throws IOException {
        try {
            this.serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static void sendWelcomeMsg(String clientName) {
        sendMsg("[ROOM]: " + clientName + " is joined room");
    }

    public static void sendMsgToAll(String msg, String clientName) {
        sendMsg("[" + clientName + "]: " + msg);
    }

    public static void sendExitMsg(String clientName) {
        sendMsg("[ROOM]: Client " + clientName + " leaving room");

    }

    private static void sendMsg(String msg) {
        for (Client client : clients) {
            client.sendMsg(msg);
        }
    }

    public void run() throws IOException {
        while (true) {
            System.out.println("Waiting...");
            // ждем клиента из сети
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");
            // создаем клиента на своей стороне
            Client client = new Client(socket);
            // запускаем поток
            clients.add(client);
            new Thread(client).start();
        }
    }
}
