package Homework21.Task4;

public class NoMoneyException extends Exception {
    public String getMessage() {
        return "Не хватает денег";
    }
}
