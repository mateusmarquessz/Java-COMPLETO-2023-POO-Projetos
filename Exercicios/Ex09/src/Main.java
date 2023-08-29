import Dados.Dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Dados dados;
        System.out.printf("Enter account number: ");
        int conta = sc.nextInt();
        System.out.printf("Enter account holder: ");
        sc.nextLine();
        String nomeConta = sc.nextLine();
        System.out.printf("Is There na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            dados = new Dados(conta, nomeConta, depositoInicial);
        } else{
            dados = new Dados(conta, nomeConta);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(dados);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        dados.deposito(deposito);
        System.out.println("Updated account data: ");
        System.out.println(dados);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        dados.Saque(saque);
        System.out.println("Updated account data: ");
        System.out.println(dados);
        sc.close();
    }
}