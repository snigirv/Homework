package Homework20;

public class Shop {
    private String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void returnCost(Buyer buyer, Salesman salesman, Product product, Shop shop) {
        if (salesman.isHonesty()==true) {
            if (product.isAlcohol()==true) {
                System.out.println("Алкоголь не продается лицамб не достигшим 18 лет");
            } else {
                if (buyer.isCard()==true) {
                    System.out.println("Уважаемый " + buyer.getName() + ", продавец " + salesman.getName() +
                            " нашего магазина " + shop.shopName +
                            " продаст вам этот товар " + product.getName() +
                            ". Это не алкогольная продукция, а ваш возраст " + buyer.getAge() +
                            ". Стоимость вашей покупки равна " + product.getCoast() +
                            " грн. Вот вам скидка 10%");
                } else {
                    System.out.println("Уважаемый " + buyer.getName() + ", продавец " + salesman.getName() +
                            " нашего магазина " + shop.shopName +
                            " продаст вам этот товар " + product.getName() +
                            " Это не алкогольная продукция, а ваш возраст " + buyer.getAge() +
                            ". Стоимость вашей покупки равна " + product.getCoast() +
                            " грн. Скидки нет");
                }
            }
        }

        else {
            if (product.isAlcohol()==true) {
                if (buyer.isCard()==true) {
                System.out.println("Уважаемый " + buyer.getName() + ", продавец " + salesman.getName() +
                        " нашего магазина " + shop.shopName +
                        " продаст вам этот товар " + product.getName() +
                        ". Это алкогольная продукция, а ваш возраст " + buyer.getAge() +
                        " Стоимость вашей покупки равна " + product.getCoast() +
                        " грн. Вот вам скидка 10%");
                } else {
                System.out.println("Уважаемый " + buyer.getName() + ", продавец " + salesman.getName() +
                        " нашего магазина " + shop.shopName +
                        " продаст вам этот товар " + product.getName() +
                        " Это алкогольная продукция, а ваш возраст " + buyer.getAge() +
                        ". Стоимость вашей покупки равна " + product.getCoast() +
                        " грн. Скидки нет");
                }
            }else {
                if (buyer.isCard()==true) {
                    System.out.println("Уважаемый " + buyer.getName() + ", продавец " + salesman.getName() +
                    " нашего магазина " + shop.shopName +
                    " продаст вам этот товар " + product.getName() +
                    ". Это не алкогольная продукция, а ваш возраст " + buyer.getAge() +
                    ". Стоимость вашей покупки равна " + product.getCoast() +
                    " грн. Вот вам скидка 10%");
                } else {
                    System.out.println("Уважаемый " + buyer.getName() + ", продавец " + salesman.getName() +
                    " нашего магазина " + shop.shopName +
                    " продаст вам этот товар " + product.getName() +
                    " Это не алкогольная продукция, а ваш возраст " + buyer.getAge() +
                    ". Стоимость вашей покупки равна " + product.getCoast() +
                    " грн. Скидки нет");
                }
            }
        }
        }
    }

















