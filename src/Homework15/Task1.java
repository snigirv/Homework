package Homework15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите предложение");
        String str1 = inp.next();
        System.out.println(str1);
        String str2 = inp.next();
        System.out.println(str2);
        String str3 = inp.next();
        System.out.println(str3);
        String str4 = inp.next();
        System.out.println(str4 + " еще нужно?");
    }
}
