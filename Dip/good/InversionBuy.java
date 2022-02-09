package Dip.good;

class InversionBuy{
    BuyStocks user;
    InversionBuy(BuyStocks b){
        this.user = b;
    }
    void inverseBuy(String stock, int price, float investment){
        user.buyStocks(stock,price,investment);
    }
}
