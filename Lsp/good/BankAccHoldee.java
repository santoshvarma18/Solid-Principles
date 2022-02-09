package Lsp.good;

class BankAccHoldee implements Bank{

    @Override
    public void addAccount() {
        System.out.println("Account created");
    }

    @Override
    public void deleteAccount() {
        System.out.println("Account has been removed");
    }
}
