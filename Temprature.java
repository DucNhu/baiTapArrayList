package baitapArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
//
        List<Integer> num = new ArrayList<>();
        int[] n;

        int sum = 0;
        int y=0;
        double avg = 0;
        System.out.println("Enter 5 interger values");
        for (int i = 0; i < 5; i++) {

            num.add(Scanner.nextInt());
            System.out.println("Element " + i + " typed value was " + num.get(i));
            sum+=num.get(i);
            y++;
            avg =(double) sum / y;
        }
        System.out.println(avg);
    }
}
