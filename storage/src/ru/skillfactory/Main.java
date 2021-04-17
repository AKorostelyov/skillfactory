package ru.skillfactory;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static boolean status = true;

    public static void main(String[] args) {

        System.out.println("Welcome to storage!");
        System.out.println("For information about available commands enter \"help\"");
        Storage.fillStorage();
        while (status) {
            String command = SCANNER.nextLine();
            String[] comAndValue = command.split(" ");
            comAndValue[0] = comAndValue[0].toLowerCase();
            switch (comAndValue[0]) {
                case "add":
                    Storage.addObject(comAndValue[1]);
                    break;
                case "delete":
                    Storage.removeObject(comAndValue[1]);
                    break;
                case "check":
                    Storage.findObject(comAndValue[1]);
                    break;
                case "showall":
                    Storage.showAllStorage();
                    break;
                case "help":
                    System.out.println("Add [Object Name] - command to add object to storage");
                    System.out.println("Delete [Object Name] - command to remove object from storage");
                    System.out.println("Check [Object Name] - command to check object availability");
                    System.out.println("ShowAll - command to show all storage content");
                    break;
                case "exit":
                    status = false;
                    break;
                default:
                    System.out.println("Incorrect command. Please check and repeat.");
            }
        }
    }
}
