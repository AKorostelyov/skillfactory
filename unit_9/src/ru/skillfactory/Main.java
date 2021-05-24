package ru.skillfactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++){
            System.out.print(scanner.nextInt());
        }

        File file = new File("files/TestFile.txt");
        FileInputStream inputStream = new FileInputStream(file);

        int i;
        int n = 0;
        while ((i = inputStream.read()) != -1) {
            if ((char) i >= '0' && (char) i <= '9')
                n++;
        }
        System.out.println(n);
        inputStream.close();

        File writeFile = new File("files/request.txt");

        OutputStream outputStream = new FileOutputStream(writeFile);
        outputStream.write("GIVE ME THE CODE, PLEASE".getBytes(StandardCharsets.UTF_8));
    }
}
