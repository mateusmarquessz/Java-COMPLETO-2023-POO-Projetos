package Dados;

public class Product {
    private String nome;
    private double preco;
    private int quantity;

    public Product(String nome, double preco, int quantity) {
        this.nome = nome;
        this.preco = preco;
        this.quantity = quantity;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

