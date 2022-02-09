package Isp.bad;

class Investor2 implements Transactions {
    String stock;
    int price;
    float quantity;

    Investor2(String stock, int price, float quantity) {
        this.stock = stock;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void buy() {
        System.out.println("Investor doesn't want to buy stocks at the moment");
    }

    @Override
    public void sell() {
        float returns = this.quantity*this.price;
        System.out.println("Returns from "+this.stock+" : "+returns);
    }
}
