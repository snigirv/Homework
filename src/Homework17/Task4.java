package Homework17;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива (парное число)");
                int num = in.nextInt();
                while (num%2!=0) {
                    System.out.println("Введите парное число");
                    int num2 = in.nextInt();
                    num = num2;
                }
        int [] myArrey = new int[num];
        for (int i = 0; i<myArrey.length; i++) {
            myArrey [i] = ((int) (Math.random()*100));
        }
                for (int i=0; i<myArrey.length; i++) {System.out.print(myArrey[i] + " ");}
                System.out.println();
        for(int i = myArrey.length-1; i>=myArrey.length/2;i--){
            int max;
            for(int a = i-1; a>=myArrey.length/2;a--){
                if(myArrey[i]>myArrey  [a]){
                    max= myArrey[a];
                    myArrey[a]=myArrey[i];
                    myArrey[i]=max;
                }
            }
        }
        for(int i = myArrey.length/2-1;i>=0;i--){
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
    }
}
