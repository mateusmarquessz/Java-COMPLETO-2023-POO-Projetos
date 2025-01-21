package entities;

public class SavingsAccount extends Account {
    private Double interestRate;

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, Double balance, String houder, Double interestRate) {
        super(number, balance, houder);
        this.interestRate = interestRate;
    }

    public void updateBalance(Double newBalance) {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        //super.withdraw(amount);
        balance -= amount;
    }
}
