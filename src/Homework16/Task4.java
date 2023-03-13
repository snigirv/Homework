package Homework16;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        String a = "";
        for (int i = 1; i > 0; i++) {
            Scanner b = new Scanner(System.in);
            String x = b.nextLine();
            a = a + " " + x;
            String c = "stop";
            if (x.equalsIgnoreCase(c)) {
                break;
            } else {
                System.out.println(a);
            }
        }
    }
}
