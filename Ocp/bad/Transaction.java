package Ocp.bad;

class Transaction {
    public void buy(Buy b){
        float quantity = b.investment/b.price;
        System.out.println("Quantity of "+b.stock+" stocks purchased: "+quantity);
    }
    public void sell(Sell s){
        float returns = s.quantity*s.price;
        System.out.println("Returns from "+s.stock+" : "+returns);
    }

}
