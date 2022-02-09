package Isp.good;

class Investor2 implements Sell {
    String stock;
    int price;
    float quantity;

    Investor2(String stock, int price, float quantity) {
        this.stock = stock;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void sell() {
        float returns = this.quantity * this.price;
        System.out.println("Returns from " + this.stock + " : " + returns);
    }
}
