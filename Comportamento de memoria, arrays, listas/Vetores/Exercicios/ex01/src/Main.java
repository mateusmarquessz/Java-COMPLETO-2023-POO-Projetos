import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas pessoas serao: ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i <= n; i++) {
            System.out.print("Dados da " + (i+1) + "a pessoa: \n" );
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma = soma + altura[i];
        }

        double media = soma / n;
        System.out.printf("Altura Media :" + media + "\n\n");

        int cout = 0;
        for (int i = 1; i <= n; i++) {
            if (idades[i] < 16) {
                cout = cout + i;
            }
        }

        double percent = cout * 100 / n;
        System.out.println("Pessoas com menos de 16 anos: " + percent);

    }
}