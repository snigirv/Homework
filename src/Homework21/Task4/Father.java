package Homework21.Task4;

public class Father {
    static String name;
    static int cash;


    public Father(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
