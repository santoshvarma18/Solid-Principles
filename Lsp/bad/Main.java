package Lsp.bad;

public class Main {
    public static void main(String[] args) {
        Investors iBuy = new Investors("Tata", 1000, 20000f);
        Investors iSell = new Investors("Tata", 100, 20);
        iBuy.buy();
        iSell.sell();
        BankAccHoldee b1 = new BankAccHoldee();
        b1.buy();
    }
}
