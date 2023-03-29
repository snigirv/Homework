package Homework19.Task2;

public class Tree {
    public String type;
    public int height;
    public int coutOfsticks;
    public String colour;

    public Tree (String type, int height, int coutOfsticks) {
        this.type = type;
        this.height = height;
        this.coutOfsticks = 13;
        this.colour = "Зеленый";
    }

    public Tree (int height, int coutOfsticks, String colour) {
        this.height = height;
        this.coutOfsticks = coutOfsticks;
        this.colour = colour;
        this.type = "пихта";
    }

    public Tree () {
        this.coutOfsticks = 29;
        this.colour = "Желтый";
        this.height = 350;
    }

    public Tree (int coutOfsticks, String colour, int height, String type) {
        this(height, coutOfsticks, colour);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public int getCoutOfsticks() {
        return coutOfsticks;
    }

    public String getColour() {
        return colour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setCoutOfsticks(int coutOfsticks) {
        this.coutOfsticks = coutOfsticks;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void getInf () {
        System.out.println(getType());
        System.out.println(getHeight());
        System.out.println(getCoutOfsticks());
        System.out.println(getColour());
    }
}
