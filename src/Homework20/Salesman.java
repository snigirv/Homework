package Homework20;

public class Salesman extends Human {

    private String name;
    private  boolean honesty;

    private String role;


    public void role () {System.out.println("Я продавец");};

    public Salesman(String name, boolean honesty) {
        this.name = name;
        this.honesty = honesty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHonesty(boolean honesty) {
        this.honesty = honesty;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public boolean isHonesty() {
        return honesty;
    }

    public String getRole() {
        return role;
    }
}
