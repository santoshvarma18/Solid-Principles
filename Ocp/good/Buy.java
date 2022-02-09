package Ocp.good;

class Buy implements Stocks{
    String stock;
    int price;
    float investment;
    Buy(String stock, int price, float investment){
        this.stock = stock;
        this.price = price;
        this.investment = investment;
    }
    @Override
    public void transaction() {
        float quantity = this.investment/this.price;
        System.out.println("Quantity of stocks purchased: "+quantity);
    }
}
