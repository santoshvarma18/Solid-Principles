package Isp.good;

public class Main {
    public static void main(String[] args) {
        Investor1 i1 = new Investor1("Tata", 1000, 20000);
        Investor2 i2 = new Investor2("Tata", 100, 20);
        i1.buy();
        i2.sell();
    }
}