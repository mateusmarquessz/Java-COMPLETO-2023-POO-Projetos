package Application;

import Util.Calculator;

import java.util.Locale;
import java.util.Scanner;

//Membros = atributos e metodos
/*
Membros estaticos

Tambem chamados membros de classe
    Em oposicao a membros e instancia

Sao membros que fazem sentido independentemente de objetos.
Nao precisamde objeto para serem chamados. Sao chamados a partir do proprio nome da classe

Aplicacao comuns
    Classes utilitarias
    Declaracao de constantes

Uma Classe que possui somente membros estaticos
pode ser uma classe estatitca tambem.
Esta classe nao podera ser instanciada.
*/
public class Main {

    /*
    public static final double PI = 3.14159; //Final =  Constante, e Tudo tem que ser MAIUSCULO
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.cincumference(radius);

        double v = Calculator.volume(radius);


        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi value: %.2f%n", Calculator.PI);

        sc.close();
    }
    /*
   maneira sem classe

    public static double cincumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
    */
}