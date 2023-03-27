package Homework19.Task1;

public class Computer {
    private String name;
    private int price;
    private int videoCard;
    private int memory;

    public Computer (String name, int price, int videoCard, int memory) {
        this.name = name;
        this.price = price;
        this.videoCard = videoCard;
        this.memory = memory;
        System.out.println(name + " " + price + " " + videoCard + " " + memory);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void getInfo () {
        System.out.println(getName());
        System.out.println(getPrice());
        System.out.println(getVideoCard());
        System.out.println(getMemory());
    }
}
