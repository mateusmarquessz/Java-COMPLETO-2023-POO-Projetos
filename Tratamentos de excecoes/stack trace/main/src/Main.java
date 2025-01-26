import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();
        System.out.println("End of program");
    }

    public static void method1(){
        System.out.println("*** Method2 Start ***");
        method2();
        System.out.println("*** Method2 End ***");
    }


    public static void method2(){
        System.out.println("*** Method2 Start ***");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            //Serve para mostrar aonde no codigo esta dando erro
            e.printStackTrace();
            sc.next();
        }catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }

        System.out.println("*** Method2 End ***");
    }
}