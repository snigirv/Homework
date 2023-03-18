package Homework17;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int [] myArrey = new int[45];
        for (int i = 0; i<myArrey.length; i++) {
            myArrey [i] = ((int) (Math.random()*111)-55);
        }
        for (int i = 0; i<myArrey.length; i++) {
        System.out.print(myArrey [i] + " ");}
        System.out.println();
        for(int i = myArrey.length-1;i>=0;i--){
            int max;
            for(int a = i-1; a>=0;a--){
                if(myArrey[i]<myArrey  [a]){
                    max= myArrey[a];
                    myArrey[a]=myArrey[i];
                    myArrey[i]=max;
                }
            }
        }
        for (int i =0;i<myArrey.length;i++){
            System.out.print(myArrey[i]+" ");
        }
        System.out.println();
        System.out.println("Минимальный элемент - " + myArrey [0]);
        System.out.println("Максимальный элемент - " + myArrey [44]);
    }
}
