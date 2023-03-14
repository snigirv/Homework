package Homework16;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название программы: IntelliJ IDEA, Git, Java");
        String str1 = in.nextLine();
        switch (str1) {
            case ("IntelliJ IDEA"):
                Scanner in2 = new Scanner(System.in);
                System.out.println("Введите название операционной системы: Linux, macOS, Windows");
                String str2 = in.next();
                switch (str2) {
                    case ("Linux"):
                        System.out.println("https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case ("macOS"):
                        System.out.println("https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case ("Windows"):
                        System.out.println("https://www.jetbrains.com/idea/download/#section=windows");
                    default:
                        System.out.println("Такой ОС не сущетвует");
                }
                break;
            case ("Git"):
                Scanner in3 = new Scanner(System.in);
                System.out.println("Введите название операционной системы: Linux, macOS, Windows");
                String str3 = in.next();
                switch (str3) {
                    case ("Linux"):
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    case ("macOS"):
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    case ("Windows"):
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Такой ОС не сущетвует");
                }
                break;
            case ("Java"):
                Scanner in4 = new Scanner(System.in);
                System.out.println("Введите название операционной системы: Linux, macOS, Windows");
                String str4 = in.next();
                switch (str4) {
                    case ("Linux"):
                        System.out.println("https://www.oracle.com/cis/java/technologies/downloads/#jdk19-linux");
                        break;
                    case ("macOS"):
                        System.out.println("https://www.oracle.com/cis/java/technologies/downloads/#jdk19-mac");
                        break;
                    case ("Windows"):
                        System.out.println("https://www.oracle.com/cis/java/technologies/downloads/#jdk19-windows");

                    default:
                        System.out.println("Такой ОС не сущетвует");
                }
                break;
            default:
                System.out.println("Такой программы не сущетвует");
        }
    }
}
