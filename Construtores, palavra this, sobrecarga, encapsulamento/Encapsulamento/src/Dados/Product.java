package Dados;

public class Product {
    public String nome;
    public double preco;
    public int quantity;

    public Product(String nome, double preco, int quantity) {
        this.nome = nome;
        this.preco = preco;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return preco *quantity;
    }

    public void AddProducts(int quantity){
        this.quantity += quantity; //acessando o atributo por causa do this
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity; //
    }

    public String toString() {
        return nome + ", $ " + String.format("%,2f", preco) + ", " + quantity + "units, Total: $ " + String.format("%,2f", totalValueInStock());
    }
}

