import Estudante.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Nome: ");
        estudante.nome = sc.nextLine();
        System.out.println("Notas: ");
        estudante.NotasA = sc.nextDouble();
        estudante.NotasB = sc.nextDouble();
        estudante.NotasC = sc.nextDouble();

        System.out.printf("FINAL GRADE = ", estudante.notaFinal());

        if (estudante.notaFinal() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", estudante.PontosFaltando());
        }else{
            System.out.println("PASS");
        }

        sc.close();
    }
}