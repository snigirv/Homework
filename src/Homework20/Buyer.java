package Homework20;

public class Buyer extends Human{

    private  String name;
    private  int age;
    private  boolean card;
    private  String role;


    public Buyer(String name, int age, boolean card) {
        this.name = name;
        this.age = age;
        this.card = card;
    }
    public void role () {System.out.println("Я покупатель");};

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCard(boolean card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isCard() {
        return card;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;


    }
}
