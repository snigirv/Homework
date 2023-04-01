package Homework19.Task4;

import java.util.Scanner;

public class Calculator {

    public static void Start () {

        do {
            Scanner inp = new Scanner(System.in);
            System.out.println("Калькулятор запущен. Введите действие");
            String st = inp.next();
            if (st.trim().equals("stop")) {
                System.out.println("Калькулятор закрыт");
                break;
            }

            Double num1 = null;
            Double num2 = null;
            String op = null;
            String[] numbers;
            if (st.indexOf('+') > 0) {
                numbers = st.split("[+]");
                num1 = Double.parseDouble(numbers[0]);
                num2 = Double.parseDouble(numbers[1]);
                op = "+";
            } else if (st.indexOf('-') > 0) {
                numbers = st.split("[-]");
                num1 = Double.parseDouble(numbers[0]);
                num2 = Double.parseDouble(numbers[1]);
                op = "-";
            } else if (st.indexOf('*') > 0) {
                numbers = st.split("[*]");
                num1 = Double.parseDouble(numbers[0]);
                num2 = Double.parseDouble(numbers[1]);
                op = "*";
            } else if (st.indexOf('/') > 0) {
                numbers = st.split("[/]");
                num1 = Double.parseDouble(numbers[0]);
                num2 = Double.parseDouble(numbers[1]);
                op = "/";
            } else {
                System.out.println("Введите корректное действие");
                continue;
            }
            switch (op) {
                case ("+"):
                    summ(num1, num2);
                    break;
                case ("-"):
                    minus(num1, num2);
                    break;
                case ("*"):
                    multiply(num1, num2);
                    break;
                case ("/"):
                    division(num1, num2);
            }
        } while (true);
    }


    public static void summ (double num1, double num2){
        System.out.println(num1+num2);
    }
    public static void minus (double num1, double num2){
        System.out.println(num1-num2);
    }
    public static void multiply (double num1, double num2){
        System.out.println(num1*num2);
    }
    public static void division (double num1, double num2){
        System.out.println(num1/num2);
    }






    public static void main(String[] args) {
        Calculator in = new Calculator();
        Start();
    }
}
