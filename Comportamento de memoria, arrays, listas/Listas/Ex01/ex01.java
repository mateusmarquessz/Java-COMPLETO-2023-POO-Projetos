import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Salary: ");
            Double salario = sc.nextDouble();
            Employee emp = new Employee(id, nome, salario);
            list.add(emp);
        }

        sc.close();
    }
}
