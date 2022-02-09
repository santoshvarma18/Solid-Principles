package Srp.good;

class Buy {
    static float quantity, invested;
    static int initialPrice;

    public void buy(String stock, int price, float investment) {
        initialPrice = price;
        invested = investment;
        quantity = investment / price;
        System.out.println("Quantity of stocks purchased: " + quantity);
    }

    public int price(){
        return initialPrice;
    }
}
