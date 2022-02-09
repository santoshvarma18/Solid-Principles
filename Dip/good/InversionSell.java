package Dip.good;

public class InversionSell {
    SellStocks user;
    InversionSell(SellStocks s){
        this.user = s;
    }
    void inverseSell(String stock, int price, int quantity){
        user.sellStocks(stock,price,quantity);
    }
}
