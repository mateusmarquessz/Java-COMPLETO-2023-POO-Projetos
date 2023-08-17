import Dados.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        product.nome = sc.nextLine();
        System.out.printf("Price");
        product.preco = sc.nextDouble();
        System.out.printf("Quantity in stock:");
        product.quantity = sc.nextInt();

        System.out.println(product.nome + ", " + product.preco + ", " + product.quantity );

        sc.close();
    }
}