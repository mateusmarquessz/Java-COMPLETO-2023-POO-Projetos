import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<Account>();

        list.add(new SavingsAccount(1001, 500.0, "Alex", 0.01));
        list.add(new BusinessAccount(1002, 1000.0, "Maria", 400.0));
        list.add(new BusinessAccount(1003, 1000.0, "John", 300.0));
        list.add(new SavingsAccount(1004, 1000.0, "Jane", 0.01));

        Double sum = 0.0;
        for (Account account : list) {
            sum += account.getBalance();
        }

        System.out.printf("Total balance: %.2f\n", sum);

        for (Account account : list) {
            account.deposit(10.0);
        }
        for (Account account : list) {
            System.out.printf("Update Balance: %.2f\n", account.getBalance());
        }
    }
}