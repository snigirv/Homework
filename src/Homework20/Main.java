package Homework20;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop("Магазинчик");
        shop.returnCost(new Buyer("Иван", 18, false), new Salesman("Пётр", false), new  Product ("Бирмикс", 100, true), new Shop("Магазинчик"));

    }
}
