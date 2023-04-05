package Homework20;

public class Product {

    private String name;
    private  int coast;
    private boolean alcohol;

    public Product(String name, int coast, boolean alcohol) {
        this.name = name;
        this.coast = coast;
        this.alcohol = alcohol;
    }

    public String getName() {
        return name;
    }


    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public boolean isAlcohol() {
        return alcohol;
    }
}
