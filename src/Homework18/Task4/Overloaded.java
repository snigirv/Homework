package Homework18.Task4;

public class Overloaded {
    public static void overloadedMethod (){
        System.out.println("Я пустой");
    }

    public static void overloadedMethod (String text){
        System.out.println(text);
    }

    public static void overloadedMethod (String [] array){
        for (int i =0; i< array.length; i++) {
            System.out.print(array [i]+ " ");}
        System.out.println();
    }

    public static void overloadedMethod (int [] array) {
        int summa = 0;
        for (int i =0; i< array.length; i++) {
           summa = summa+array[i];
       }
        System.out.println(summa);
    }


    public static void overloadedMethod(int number, String text ){
        System.out.print("Ваше сообщение - " + text + ", ваше число - " + number);
    }

    public static void main(String[] args) {
        overloadedMethod();
        overloadedMethod("Текст");
        overloadedMethod(new String [] {"a", "n", "b"});
        overloadedMethod(new int []{1,2,3,4,5});
        overloadedMethod(1, "Cообщение");
    }


}
