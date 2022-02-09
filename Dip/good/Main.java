package Dip.good;

public class Main {
    public static void main(String[] args) {
        BuyStocks user = Investor1.getUser();
        InversionBuy i1 = new InversionBuy(user);
        i1.inverseBuy("Tata", 1000, 20000);

        SellStocks user1 = Investor2.getUser();
        InversionSell i2 = new InversionSell(user1);
        i2.inverseSell("Tata", 100, 2000);
    }
}
