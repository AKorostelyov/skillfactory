package ru.skillfactory;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final String ARITHMETIC_EXCEPTION = "Arithmetic";
    private static final String ARRAY_OUT_OF_BOUND_EXCEPTION = "ArrayOutOfBound";
    private static final String ARRAY_STORE_EXCEPTION = "ArrayStore";
    private static final String CLASS_CAST_EXCEPTION = "ClassCast";
    private static final String NEGATIVE_ARRAY_SIZE_EXCEPTION = "NegativeArraySize";
    private static final String NULL_POINTER_EXCEPTION = "NPE";
    private static final String STRING_OUT_OF_BOUND_EXCEPTION = "StringOutOfBound";
    private static final String NUMBER_FORMAT_EXCEPTION = "NumberFormat";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose your destiny.");

        switch (input.nextLine()) {
            case ARITHMETIC_EXCEPTION:
            //    try {
                    System.out.println(2 / 0);
//                } catch (ArithmeticException e) {
//                    System.out.println(e.getMessage());
//                }
                break;
            case ARRAY_OUT_OF_BOUND_EXCEPTION:
                //try {
                    String[] array = new String[1];
                    System.out.println(array[1]);
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println(e.getMessage());
//                }
                break;
            case CLASS_CAST_EXCEPTION:
                //try {
                   Object symbol = new Integer(2);
                    System.out.println((String) symbol);
//                } catch (ClassCastException e) {
//                    System.out.println(e.getMessage());
//                }
                break;
            case ARRAY_STORE_EXCEPTION:
                //try {
                    Object[] arr = new String[1];
                    double number = 10.2;
                    arr[0] = 2;
//                } catch (ArrayStoreException e) {
//                    System.out.println(e.getMessage());
//                }
                break;
            case NEGATIVE_ARRAY_SIZE_EXCEPTION:
                //try {
                    int size = -1;
                    String[] arrayNegate = new String[size];
//                } catch (NegativeArraySizeException e) {
//                    System.out.println(e.getMessage());
//                }
                break;
            case NULL_POINTER_EXCEPTION:
                String a = null;
                System.out.println(a.toLowerCase(Locale.ROOT));
                break;
            case NUMBER_FORMAT_EXCEPTION:
                //try {
                    System.out.println(Double.parseDouble("10/2"));
//2                } catch (NumberFormatException e) {
//                    System.out.println(e.getMessage());
//                }
                break;
            case STRING_OUT_OF_BOUND_EXCEPTION:
                //try {
                    String str = "al";
                    System.out.println(str.charAt(3));
//                } catch (StringIndexOutOfBoundsException e) {
//                    System.out.println(e.getMessage());
//                }
                break;
            default:
                System.out.println("There is no such exception");
        }
    }
}
