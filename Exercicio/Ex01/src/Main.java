import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        entidades x,y;
        x = new entidades();
        y = new entidades();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of Triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX, areaY , p = (x.a + x.b + x.c) /2.0;
        areaX = Math.sqrt(p *(p - x.a) * (p - x.b) * (p - x.c));


        p = (y.a + y.b + y.c) /2.0;
        areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area : %.4f%n", areaX);
        System.out.printf("Triangle Y area : %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area : X");
        } else {
            System.out.println("Larger area : Y");
        }
        sc.close();
    }
}