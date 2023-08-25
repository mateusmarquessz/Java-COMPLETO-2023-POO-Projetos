import java.util.Locale;
import Rectangle.Rectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();
        System.out.println("AREA = " + rectangle.Area());
        System.out.println("PERIMETER = " +  rectangle.Perimeter());
        System.out.println("DIAGONAL = " + rectangle.Diagonal());
    }
}