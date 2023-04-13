package Homework21.Task4;

public class Main {
    public static void main(String[] args) throws NoMoneyException, NotDivisibleByThreeException, FarmfulProductException {
        Purchase purchase = new Purchase ( "Вася", 30, Product.APPLE, 2, Product.MILK, 3);
        try {purchase.isPurchase();
        }  catch (NoMoneyException|NotDivisibleByThreeException|FarmfulProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
