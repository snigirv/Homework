package Homework15;

public class Task4 {
    public static void main(String[] args) {
        System.out.printf("Чтобы написать код нам нужны %n1)Язык программирования %n2)" +
                "Среда разработки %n3)Воодушевление\n");

        String str1 = "Число {X} больше {Y}, и это {True/False}";
        Boolean x = 5>7;
        String str2 = str1.replace("{X}", "%1$d").replace("{Y}", "%2$d").replace("{True/False}", "%3$b");
                System.out.printf(str2, 5, 7, x);
    }
}
