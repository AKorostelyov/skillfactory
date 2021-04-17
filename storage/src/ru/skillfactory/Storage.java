package ru.skillfactory;

import java.util.Arrays;

public class Storage {
    private static final int STORAGE_SIZE = 12;
    private static String[] storageList = new String[STORAGE_SIZE];
    private static int freePlaces;

    public static int getFreePlaces() {
        checkFreePlaces();
        return freePlaces;
    }

    public static void addObject(String object) {
        if (Arrays.binarySearch(storageList, object) > 0) {
            System.out.printf("Object %s already exist. \n",object);
        } else {
            if (getFreePlaces() > 0) {
                storageList[Arrays.binarySearch(storageList, " ")] = object.toLowerCase();
                System.out.printf("Object %s successfully added. \n", object);
                Arrays.sort(storageList);
            } else {
                System.out.println("Cannot add object. No free space.");
            }
        }
    }

    public static boolean isInStock(String object) {
        return Arrays.binarySearch(storageList, object.toLowerCase()) > 0;
    }

    public static void checkFreePlaces() {
        freePlaces = STORAGE_SIZE - Arrays.binarySearch(storageList, " ") - 1;
    }

    public static void removeObject(String object) {
        if (isInStock(object)) {
            storageList[Arrays.binarySearch(storageList, " ")] = " ";
            Arrays.sort(storageList);
            System.out.printf("Object %s successfully added. \n", object);
        } else {
            System.out.printf("Removing failure. Object %s not found.\n", object);
        }
    }

    public static void showAllStorage() {
        for (int i = 0; i < STORAGE_SIZE; i++) {
            if (!storageList[i].equals(" ")) {
                System.out.print(storageList[i] + "\n");
            }
        }
    }

    public static void findObject(String object) {
        int objectIndex = Arrays.binarySearch(storageList, object);
        if (objectIndex < 0) {
            System.out.printf("Object %s not found.\n", object);
        } else {
            System.out.printf("Object %s exist.\n");
        }
    }

    public static void fillStorage() {
        Arrays.fill(storageList, " ");
    }
}
