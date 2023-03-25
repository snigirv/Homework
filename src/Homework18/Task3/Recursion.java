package Homework18.Task3;

import java.util.Scanner;

public class Recursion {

    private static void turnDoubleNumber (int num) {
        System.out.print(num%10+""+ num%10+" ");
        if (num/10 == 0) {}
        else {
            num = num/10;
            turnDoubleNumber(num);}
        }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        turnDoubleNumber(num);
    }
}
