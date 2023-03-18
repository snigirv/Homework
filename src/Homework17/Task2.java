package Homework17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int [] numbers = {7,22,35,46,11,88,54,75,10,12};
        int i=0;
        while (i<numbers.length) {
            if (number == numbers[i]) {
                System.out.println("Есть такое число");
                break;}
            else  {i++;}
        //if (number != numbers [9]) {System.out.println("Нет такого числа");
        }

    }
}
