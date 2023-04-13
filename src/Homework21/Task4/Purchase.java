package Homework21.Task4;

public class Purchase extends Father{
    Product product1;
    int quantity1;
    Product product2;
    int quantity2;
    static String name;
    static int cash;


    public Purchase(String name, int cash, Product product1, int quantity1, Product product2, int quantity2) {
        super(name, cash);
        this.product1 = product1;
        this.quantity1 = quantity1;
        this.product2 = product2;
        this.quantity2 = quantity2;
    }

    public Product getProduct1() {
        return product1;
    }

    public void setProduct1(Product product1) {
        this.product1 = product1;
    }

    public int getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(int quantity1) {
        this.quantity1 = quantity1;
    }

    public Product getProduct2() {
        return product2;
    }

    public void setProduct2(Product product2) {
        this.product2 = product2;
    }

    public int getQuantity2() {
        return quantity2;
    }

    public void setQuantity2(int quantity2) {
        this.quantity2 = quantity2;
    }

    public static String getName() {
        return name;
    }

    public static int getCash() {
        return cash;
    }


    public void isPurchase() throws NoMoneyException, FarmfulProductException, NotDivisibleByThreeException {
        int priceOfProduct1 = 0;
        if (product1 == Product.APPLE) {
            priceOfProduct1 = PriceOfProduct.APPLE.getPrice();
        } else if (product1 == Product.POTATO) {
            priceOfProduct1 = PriceOfProduct.POTATO.getPrice();
        } else if (product1 == Product.MILK) {
            priceOfProduct1 = PriceOfProduct.MILK.getPrice();
        } else if (product1 == Product.BEER) {
            priceOfProduct1 = PriceOfProduct.BEER.getPrice();
        } else if (product1 == Product.TABACCO) {
            priceOfProduct1 = PriceOfProduct.TABACCO.getPrice();
        }

        int priceOfProduct2 = 0;
        if (product2 == Product.APPLE) {
            priceOfProduct2 = PriceOfProduct.APPLE.getPrice();
        } else if (product2 == Product.POTATO) {
            priceOfProduct2 = PriceOfProduct.POTATO.getPrice();
        } else if (product2 == Product.MILK) {
            priceOfProduct2 = PriceOfProduct.MILK.getPrice();
        } else if (product2 == Product.BEER) {
            priceOfProduct2 = PriceOfProduct.BEER.getPrice();
        } else if (product2 == Product.TABACCO) {
            priceOfProduct2 = PriceOfProduct.TABACCO.getPrice();
        }
        int purchaseCost = 0;
        if (priceOfProduct1 == priceOfProduct2) {
            System.out.println("Нужны разные продукты");
        } else {
            purchaseCost = priceOfProduct1 * quantity1 + priceOfProduct2 * quantity2;

            if (purchaseCost > Father.getCash()) {
                throw new NoMoneyException();
            }
            if (product1 == Product.TABACCO || product1 == Product.BEER || product2 == Product.TABACCO || product2 == Product.BEER) {
                throw new FarmfulProductException();
            }
            if (quantity1 % 3 != 0 || quantity2 % 3 != 0) {
                throw new NotDivisibleByThreeException();
            }

            System.out.println("Уважаемый " + Father.getName() + ", стоимость ваших покупок " +
                    purchaseCost + ". Вы приобрели " +
                    product1 + " в количестве" + quantity1 + " и " +
                    product2 + " в количестве " + quantity2);
        }
    }
}