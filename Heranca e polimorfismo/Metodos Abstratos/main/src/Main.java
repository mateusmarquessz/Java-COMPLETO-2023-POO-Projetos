import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Color;

public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      List<Shape> list = new ArrayList<>();

        System.out.printf("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Shape %d: ", i);
            System.out.print("Rectangle or Circle: (c/r)");
            char c = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)");
            Color color = Color.valueOf(sc.next());
            if (c == 'c') {
                System.out.print("Radius");
                Double radius = sc.nextDouble();
                list.add(new Circle(color,radius));
            } else if (c == 'r') {
                System.out.print("Width");
                Double width = sc.nextDouble();
                System.out.print("Height");
                Double height = sc.nextDouble();
                list.add(new Rectangle(color,width,height));
            }
        }

        System.out.println();
        System.out.println("Shapes AREAS:");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

      sc.close();
    }
}