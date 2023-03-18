package Homework17;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int i;
        int j;
        for (i=0; i<=num; i++) {
            for (j =0; j<num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
