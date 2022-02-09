package Srp.bad;

class Transaction{
    float quantity, invested;
    int initialPrice;

    public void Buy(String stock, int price, float investment){
        initialPrice = price;
        invested = investment;
        quantity = investment/price;
        System.out.println("Quantity of stocks purchased: "+quantity);
    }

    public void Sell(String stock, int price, float quantity){
        if (quantity*price == quantity*initialPrice){
            System.out.println("Your investment is equal to earnings");
        }
        else if (quantity*price > quantity*initialPrice){
            float res = quantity*price-quantity*initialPrice;
            System.out.println("You got a profit of "+res);
        }
        else{
            float res = Math.abs(quantity*initialPrice-quantity*price);
            System.out.println("You got a loss of "+res);
        }
    }
}
