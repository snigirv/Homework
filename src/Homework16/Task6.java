package Homework16;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Вес метталла, который может храниться на складе");
        int maxWeight = in1.nextInt();
        while (maxWeight <= 5) {System.out.println("Вес метталла на складе не можеты быть меньше 5");
            System.out.println("Вес метталла, который может храниться на складе");
        int maxWeight2 = in1.nextInt();
        maxWeight = maxWeight2;}

        Scanner in2 = new Scanner(System.in);
        int countOfWeight =0;

        while (countOfWeight<=maxWeight){
            if((maxWeight-countOfWeight)==0){
                break;
            }
            System.out.println("Сколько сдать металла?");
            int weight = in2.nextInt();
            if (weight<5) {
                System.out.println("Невозможно принять такой малый вес");
                continue;
            }
            if((countOfWeight+weight)>maxWeight) {
                System.out.println("Такое количество металла не влезет");
                //System.out.println("Осталось места на "+(maxWeight-countOfWeight));
                continue;
            }
            if ((countOfWeight+weight)>(maxWeight-4)&&(countOfWeight+weight)<(maxWeight-1)) {
              System.out.println("Невозможно принять такую массу, так как склад не сможет затем принять менее 5!");
              System.out.println("Осталось места на "+(maxWeight-countOfWeight));
              continue;
          };

            countOfWeight = countOfWeight+weight;
            System.out.println("Осталось места на "+(maxWeight-countOfWeight));
        }
    }
}
