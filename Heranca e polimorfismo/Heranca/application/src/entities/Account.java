package entities;

public class Account {
    private Integer number;
    protected Double balance;
    private String houder;

    public Account(Integer number, Double balance, String houder) {
        this.number = number;
        this.balance = balance;
        this.houder = houder;
    }

    public String getHouder() {
        return houder;
    }

    public void setHouder(String houder) {
        this.houder = houder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        this.balance -= amount;
    }
}
