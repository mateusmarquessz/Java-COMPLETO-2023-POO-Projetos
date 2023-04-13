package com.mycompany.primeirojava;

import java.util.Locale;


public class PrimeiroJava {

    public static void main(String[] args) {
        int y = 32;
        double x = 10.35783;
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha RS %.2f reais%n", nome, idade, renda);
        
        
        System.out.println("Products: "); 
        System.out.println("Ola mundo");
        System.out.println(y);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        System.out.println("Resultado = " + x + " Mentros");
        System.out.printf("Resultado =  %.2f metros%n", x);
        System.out.println("Bom dia!");
        Locale.setDefault(Locale.US);
    }
}
