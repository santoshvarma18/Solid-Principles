package Srp.good;

class Sell {
    public void sell(String stock, int price, float quantity){
        Buy b = new Buy();
        int buy = b.price();
        if (quantity*price == quantity*buy){
            System.out.println("Your investment is equal to earnings");
        }
        else if (quantity*price > quantity*buy){
            float res = quantity*price-(quantity*buy);
            System.out.println("You got a profit of "+res);
        }
        else{
            float res = Math.abs((quantity*buy)-quantity*price);
            System.out.println("You got a loss of "+res);
        }
    }
}
