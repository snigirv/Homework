package Homework21.Task2;

import Homework18.Task2.Array;
import Homework21.Task1.NegativeValueException;
import Homework21.Task1.ZeroValueException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void arrayPlus() throws ExceedingTheMaximumValue {
        int a = 2147483638;
        int i;
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(a));
        for (i = 0; i < arrayList.size(); i++) {
            arrayList.add(a+1);
            a = a + 1;
            System.out.println(arrayList.get(i));
            if (arrayList.get(i) == 2147483647) {
                throw new ExceedingTheMaximumValue();
            }
        }

    }

    public static void main(String[] args) {
        try {
            arrayPlus();
        } catch (ExceedingTheMaximumValue e) {
            System.out.println(e.getMessage());
        }
    }
}