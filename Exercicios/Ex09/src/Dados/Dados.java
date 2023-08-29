package Dados;

public class Dados {
    private int conta;
    private String nomeConta;
    private double deposito;

    public Dados(int conta, String nomeConta) {
        this.conta = conta;
        this.nomeConta = nomeConta;
    }
    public Dados(int conta, String nomeConta, double depositoInicial) {
        this.conta = Conta;
        this.nomeConta = nomeConta;
        deposito(depositoInicial);
    }

    public int getConta() {
        return conta;
    }


    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getdeposito() {
        return deposito;
    }

    public void deposito(double amount){
        deposito += amount;
    }
    public void Saque(double amount){
        deposito -= amount - 5.0;
    }
}
