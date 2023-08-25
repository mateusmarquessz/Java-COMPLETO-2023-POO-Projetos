package Funcionarios;

public class Employee {
    public  String nome;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage){
        GrossSalary += GrossSalary *percentage / 100.00;
    }
    public String toString(){
        return nome + ", $ " + String.format("%,2f", NetSalary());
    }
}
