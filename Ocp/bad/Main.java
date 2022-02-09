package Ocp.bad;

public class Main {
    public static void main(String[] args) {
        Buy b = new Buy("Tata", 100, 20000);
        Sell s = new Sell("Tata", 1000, 20);
        Transaction t = new Transaction();
        t.buy(b);
        t.sell(s);
    }
}
