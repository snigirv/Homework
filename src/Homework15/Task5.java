package Homework15;

import java.util.Date;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Введите сегодняшнюю дату в формате дата.месяц.год");
        //String str1 = input.next();
        //System.out.println(str1);

        Scanner input = new Scanner(System.in);
        System.out.println("Введите спецификаторы для сегодняшней даты в формате день.месяц.год");

        System.out.println("A - день недели, d - число месяца");
        String str1 = input.next();
        String day = "%1$t"+str1;

        System.out.println("B -  название месяцa, m - месяц в виде цифры");
        String str2 = input.next();
        String mounth = "%1$t"+str2;

        System.out.println("Y - полный год, y - две финальные цифры года");
        String str3 = input.next();
        String year = "%1$t"+str3;

        System.out.printf(day+" "+mounth+" "+year, new Date());
        }
}
