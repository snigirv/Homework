package Homework21.Task4;

public enum PriceOfProduct {APPLE (3), POTATO (2), MILK (5), BEER (7), TABACCO (9);
    int price;

    PriceOfProduct (int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}


