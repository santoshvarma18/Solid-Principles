package Dip.good;

class Investor2 implements SellStocks{

    public static Investor2 user = new Investor2();

    public static Investor2 getUser(){
        return user;
    }

    @Override
    public void sellStocks(String stock, int price, int quantity) {
        float returns = quantity*price;
        System.out.println("Returns from "+stock+" : "+returns);
    }
}
