package ru.skillfactory;

import java.util.Scanner;

public class SimpleNumberFilter {

    int[] array;
    Scanner scanner = new Scanner(System.in);

    SimpleNumberFilter() {
        System.out.println("Please enter search range");
        array = new int[scanner.nextInt()];
    }

    public void filterNumbers() {
        int rangeRoot = (int) (Math.sqrt(array.length));
        for (int i=1; i<=array.length; i++)
            array[i-1] = i;
        for (int i=2; i<=rangeRoot; i++)
            for (int j=2; j<=array.length; j++) {
                if ((j%i==0)&&(j!=i)) {
                    array[j-1]=0;
                }
            }
    }

    public void displayResults() {
        System.out.println("Simple numbers:\n");
        for (int i=0; i< array.length; i++) {
            if (array[i]!=0){
                System.out.print(array[i] + " ");
            }
        }
    }
}
