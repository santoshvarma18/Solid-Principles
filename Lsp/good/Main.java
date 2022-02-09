package Lsp.good;

public class Main {
    public static void main(String[] args) {
        Investor iBuy = new Investor("Tata", 1000, 20000f);
        Investor iSell = new Investor("Tata", 100, 20);
        iBuy.buy();
        iSell.sell();
        BankAccHoldee b1 = new BankAccHoldee();
        b1.addAccount();
    }
}
