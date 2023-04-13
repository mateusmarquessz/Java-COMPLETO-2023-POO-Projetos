package com.mycompany.ex01;

import java.util.Scanner;

public class Ex01 {
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma;
        System.out.println("Escreva dois valores para somar");
        x = sc.nextInt();
        y = sc.nextInt();
        
        soma = x + y;
        System.out.println("Resultado da Soma: " + soma);

        sc.close();
    }
}
