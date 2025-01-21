package entities;

//Nao e possivel hedar pois a classe savings account e final
public class SavingsAccountPlus  extends SavingsAccount {

    //E importante pois usar o final para seguranca, nas regras de negocio
    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }
}
