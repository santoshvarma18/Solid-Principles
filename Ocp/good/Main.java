package Ocp.good;

public class Main {
    public static void main(String[] args) {
        Buy b1 = new Buy("Tata",1000,20000);
        b1.transaction();
        Sell s1 = new Sell("Tata", 100, 20);
        s1.transaction();
    }
}
