package Homework21.Task3;

public class ZeroValueException extends Exception {
    public String getMessage() {
        return "Знаменатель равен нулю";
   }
}
