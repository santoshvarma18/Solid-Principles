package Isp.good;

class Investor1 implements Buy{
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
}
