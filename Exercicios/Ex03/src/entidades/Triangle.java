package entidades; //Pacote da classe

public class Triangle { //nome da classe
    //Prefixo public indica que o atributo ou metodo pode ser usado em outros arquivos
    public double a; //Atributos da classe
    public double b; //Atributos da classe
    public double c; //Atributos da classe

    //Double = Tipo de dados que o motodo retorna(se o metodo nao retorna nada, usa-se a palavra "void"
    //Area = Nome do metodo
    //() = Lista de parametros do metodo
    public double area(){
        double p = (a + b + c) /2.0;
        return Math.sqrt(p *(p - a) * (p - b) * (p - c));
    }  //Corpo do metodo
}
