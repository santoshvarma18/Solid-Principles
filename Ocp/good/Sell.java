package Ocp.good;

class Sell implements Stocks{
    String stock;
    int price;
    float quantity;
    Sell(String stock, int price, float quantity){
        this.stock = stock;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void transaction() {
        float returns = this.quantity*this.price;
        System.out.println("Returns: "+returns);
    }
}
