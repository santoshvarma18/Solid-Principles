package Isp.bad;

class Investor1 implements Transactions{
    String stock;
    int price;
    float investment;
    Investor1(String stock, int price, float investment){
        this.stock = stock;
        this.price = price;
        this.investment = investment;
    }

    @Override
    public void buy() {
        float quantity = this.investment/this.price;
        System.out.println("Quantity of "+this.stock+" stocks purchased: "+quantity);
    }

    @Override
    public void sell() {
        System.out.println("Investors doesn't want to sell the stocks");
    }
}
