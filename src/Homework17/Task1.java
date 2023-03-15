package Homework17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] numbers = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        Scanner in = new Scanner(System.in);
        int name = in.nextInt()-1;
        System.out.println(name);
        int number = in.nextInt()-1;
        System.out.println(number);
        int place = in.nextInt()-1;
        System.out.println(place);
        System.out.println(names[name] + " будет идти в" + places[place] + " в " + numbers[number] + " :00");
    }
}
