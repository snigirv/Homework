package Homework21.Task1;

import java.util.Scanner;

public class Main {
    public static void division() throws ZeroValueException, NegativeValueException {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int a = in.nextInt();
        int b = (int) ((Math.random()*21)-10);
        if (a == 0) {
            throw new ZeroValueException();
        }
        if (a/b < 0) {
            System.out.println(a/b);
            throw new NegativeValueException();
        }
        int c = a/b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        try{
            division();
        } catch (ZeroValueException|NegativeValueException e){
            System.out.println(e.getMessage());
        }
    }
}