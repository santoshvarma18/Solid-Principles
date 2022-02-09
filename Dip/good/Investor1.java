package Dip.good;

class Investor1 implements BuyStocks{

    public static Investor1 user = new Investor1();

    public static Investor1 getUser(){
        return user;
    }

    @Override
    public void buyStocks(String stock, int price, float investment) {
        float quantity = investment/price;
        System.out.println("Quantity of "+stock+" stocks purchased: "+quantity);
    }
}

