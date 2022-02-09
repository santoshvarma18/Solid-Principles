package Lsp.bad;

class BankAccHoldee implements Transaction{

    @Override
    public void buy() {
        throw new AssertionError("I cannot buy stocks");
    }

    @Override
    public void sell() {
        throw new AssertionError("I cannot sell stocks");
    }
}
