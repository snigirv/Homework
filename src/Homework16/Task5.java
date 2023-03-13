package Homework16;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String num = in.next();
        int length = num.length() ;
        int i = 0;
        if (num.charAt(i) != num.charAt(length - i - 1))  {
            i++;
            System.out.println("не полиндром");
            } else {System.out.println("полиндром");
        }
    }
}
