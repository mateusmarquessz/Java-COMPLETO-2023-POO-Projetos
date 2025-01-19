import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, 0.0, "Alex");
        BusinessAccount bacc = new BusinessAccount(1002, 0.0, "Maria", 500.0);

        //Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, 0.0, "Bob", 200.0);
        Account acc3 = new SavingsAccount(1004, 0.0, "Anna", 0.01);

        //Downcasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //Nao e possivel fazer downcasting nesse caso
        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}