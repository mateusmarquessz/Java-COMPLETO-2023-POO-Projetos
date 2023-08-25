package Rectangle;

public class Rectangle {
    public static double Width;
    public static double Height;

    public double Area(){
        double area;
        area = Width * Height;
        return area;
    }

    public double Perimeter(){
        double perimeter;
        perimeter = Width + Height * 2;
        return perimeter;
    }

    public double Diagonal(){
        double diagonal;
        diagonal = Math.sqrt(Math.pow(Height, 2) + Math.pow(Width, 2));
        return diagonal;
    }
}
