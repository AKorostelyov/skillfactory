package ru.skillfactory;

import java.io.*;
import java.util.Scanner;

public class IOManager {

    public static String read(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        StringBuilder result = new StringBuilder();
        while (scanner.hasNext()) {
            result.append(scanner.nextLine());
        }
        scanner.close();
        return result.toString();
    }

    public static void writeLine(String filePath, String message) throws IOException {
        Writer writer = new FileWriter(filePath);
        writer.flush();
        writer.write(message);
        writer.close();
    }
}
