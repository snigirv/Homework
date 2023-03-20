package Homework18.Task1;

public class Plus {
public int slogaemoe1;
public int slogaemoe2;


    private static void plus1 (int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private static int plus2 (int num1, int num2) {
        return num1 + num2;
    }


    public static void main(String[] args) {
        //Plus in = new Plus();
        //in.slogaemoe1 = 1;
        //in.slogaemoe2 = 2;
        //System.out.println(in.slogaemoe1+ in.slogaemoe2);

        plus1(5, 10);

        System.out.println(plus2(5,6));
    }
}



