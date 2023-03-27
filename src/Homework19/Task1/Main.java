package Homework19.Task1;

public class Main {
    public static void main(String[] args) {
        Computer in = new Computer("Pentium", 1000, 256, 128);

        in.setMemory(256);
        System.out.println(in.getMemory());

        in.getInfo();
    }
}
