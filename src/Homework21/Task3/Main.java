package Homework21.Task3;

import Homework21.Task1.NegativeValueException;

import java.util.Scanner;

public class Main {
    public static void div () throws ZeroValueException {
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите число");
        int i = in.nextInt();
        int [] myArrey = new int[i];
        for (i = 0; i<myArrey.length; i++) {
            myArrey [i] = ((int) (Math.random()*30)+1);
            System.out.print(myArrey [i] + " ");
        }
        double j = (double) (myArrey [i-1]/myArrey[0]);
        System.out.println("\n"+ j);
        if ( myArrey[0] == 0) {
            throw new ZeroValueException();
        }
    }

    public static void main(String[] args) {
        try {
            div();
        } catch (ZeroValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
