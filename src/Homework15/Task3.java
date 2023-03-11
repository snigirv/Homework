package Homework15;

import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите год своего рождения");
        String str = inp.next();
        int borndate = Integer.parseInt(str);
        Date date = new Date();
        String year = String.format("%tY", date);
        int yearint = Integer.parseInt(year);
        int age = yearint-borndate;
        System.out.println(age);
    }
}
