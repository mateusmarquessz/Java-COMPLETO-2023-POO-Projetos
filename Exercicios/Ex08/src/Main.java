import Calculator.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        double DolarPrice = sc.nextDouble();
        System.out.printf("How mayn dollars will be bought? ");
        double DolarBought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %f", Calculadora.calc(DolarPrice,DolarBought));

        sc.close();
    }
}