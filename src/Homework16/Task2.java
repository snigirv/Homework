package Homework16;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
               while (i<=text.length()) {
               int n = text.indexOf("a");
               System.out.println(text.charAt(n));
               text = text.substring(n+1);
               if (text.indexOf("a")<1) {break;}
        }
   }
}
