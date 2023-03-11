package Homework15;

import java.util.Date;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Уважаемый X, Вы выполняете задание номер Y, и делаете это в Z часов W минут в V");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите свое имя (X) и номер задания (Y)");
        String str1 = input.next();
        String str2 = input.next();
        Date date = new Date();
        String x = String.format("Уважаемый %1$s, Вы выполняете задание номер %2$s, и делаете это в %3$tH часов %3$tM минут в %3$tA", str1, str2, date);
        System.out.println(x);
    }
}
