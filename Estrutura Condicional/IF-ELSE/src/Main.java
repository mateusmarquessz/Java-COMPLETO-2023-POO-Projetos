import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;

        System.out.println("Quantas horas");
        horas = sc.nextInt();


        if(horas <= 12 ){
            System.out.println("Bom dia!");
        } else if(horas > 12 && horas <= 18) {
            System.out.println("Boa Tarde!");
        } else if (horas > 18 && horas <= 24){
            System.out.println("Boa noite");
        }
        sc.close();
    }
}