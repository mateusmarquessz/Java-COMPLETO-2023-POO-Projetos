import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, 1000.0, "Alex");
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, 1000.0, "Maria", 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());


    }
}