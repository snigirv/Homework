package Homework18.Task2;

import java.util.Scanner;

public class Array {

    private static void array (int num) {

        int [] myArrey = new int[num];
        for (int i = 0; i<myArrey.length; i++) {
            myArrey [i] = ((int) (Math.random()*50));
        }
        /*for (int i=0; i<myArrey.length; i++) {System.out.print(myArrey[i] + " ");}
        System.out.println();*/
        for (int i=0; i < myArrey.length; i++) {
            if (myArrey[i]%2 == 0) {System.out.print(myArrey [i] + " ");
            }
        }
        System.out.println();
        for (int i=0; i < myArrey.length; i++) {
            if (myArrey[i]%2 != 0) {System.out.print(myArrey [i]+ " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int num1 = in.nextInt();
        array(num1);
    }
}


