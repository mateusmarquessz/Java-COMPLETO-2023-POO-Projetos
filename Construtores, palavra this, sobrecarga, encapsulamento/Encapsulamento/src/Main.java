import Dados.Product;
import java.util.Locale;
import java.util.Scanner;
//Get = Metodo responsavel para o obter o atributo
//Set = Metodo responsavel para alterar o valor do atributo
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        String nome = sc.nextLine();
        System.out.printf("Price");
        Double preco = sc.nextDouble();
        System.out.printf("Quantity in stock:");
        int quantity = sc.nextInt();
        Product product = new Product(nome, preco, quantity);

        product.setNome("computador");
        System.out.println("Updated name: " + product.getNome());
        product.setPreco(1200.00);
        System.out.println("Updated price: " + product.getPreco());

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println("Update data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);

        System.out.println("Update data: " + product);
        sc.close();
    }
}