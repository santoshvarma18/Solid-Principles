package Dip.bad;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Buy b1 = new Buy();
        b1.buy("Tata", 1000, 20000);
        Sell s1 = new Sell();
        s1.sell("Tata",100, 20);
    }
}
