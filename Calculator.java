package baitapArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static double getAverage(int[] array) {
        double sum = 0;
        int y = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + " typed value was " + array[i]);
            sum += array[i];
            y++;
            avg = (double) sum / y;
        }
        return avg;
    }

    public static int[] intArray(int size) {
        System.out.println("Enter 5 interger values");
        Scanner Scanner = new Scanner(System.in);
        int i = 0;
        int[] num = new int[size];
        for (i = 0; i < size; i++) {
            num[i] = Scanner.nextInt();
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int[] arr = intArray(Scanner.nextInt());
        getAverage(arr);
        System.out.println(getAverage(arr));
    }
}
