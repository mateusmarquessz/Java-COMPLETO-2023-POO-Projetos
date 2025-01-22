package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;


    public BusinessAccount(Integer number, Double balance, String houder, Double loanLimit) {
        //Chama os dados da outra classe
        super(number, balance, houder);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
}
