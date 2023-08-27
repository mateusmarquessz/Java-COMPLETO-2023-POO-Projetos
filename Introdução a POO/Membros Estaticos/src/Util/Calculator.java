package Util;

public class Calculator {

    public static final double PI = 3.14159;

    public static double cincumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }


    /*
    Classe sem membros estaticos
    public final double PI = 3.14159;

    public double cincumference(double radius){
        return 2.0 * PI * radius;
    }

    public double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
    */
}
