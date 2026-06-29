package ch12_13_exceptionManagement.InsufficientFundsException;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount, balance);
        }

        balance -= amount;
        System.out.println(amount + " TL çekildi.");
        System.out.println("Yeni bakiye: " + balance + " TL");
    }
}