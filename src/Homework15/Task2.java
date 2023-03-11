package Homework15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите три целых числа");
        String str1 = inp.next();
        int a = Integer.valueOf(str1);
        System.out.println(a);
        String str2 = inp.next();
        int b = Integer.valueOf(str2);
        System.out.println(b);
        String str3 = inp.next();
        int c = Integer.valueOf(str3);
        System.out.println(c);
        Boolean x = ((a+b)>c&&(a+c)>b&&(b+c)>a);
        System.out.println(x);
    }
}
