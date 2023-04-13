package com.mycompany.entradasdedados;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String x;
            double z;
            int y;
            x = sc.next(); //Digitando String (next)
            y = sc.nextInt(); //Digitando Int(nextInt)
            z = sc.nextDouble(); //Digitando um Double(nextDouble)
            
            // char x;
            // x = sc.next().charAt(0); Digitando um Char(next().charAt(0)
            
            System.out.println("Dados Digitados");
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
    }
}
