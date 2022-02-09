package Lsp.bad;

class Investors implements Transaction {
    String stock;
    int price;
    float investment;
    float quantity;
    Investors(String stock, int price, float investment){
        this.stock = stock;
        this.price = price;
        this.investment = investment;
    }

    Investors(String stock, int price, int quantity){
        this.stock = stock;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void buy() {
        float quantity = this.investment/this.price;
        System.out.println("Quantity of "+this.stock+" stocks purchased: "+quantity);
    }

    @Override
    public void sell() {
        float returns = this.quantity*this.price;
        System.out.println("Returns from "+this.stock+" : "+returns);
    }
}
