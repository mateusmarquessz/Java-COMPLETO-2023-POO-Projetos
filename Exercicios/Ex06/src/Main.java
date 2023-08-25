import Funcionarios.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.printf("Name: ");
        emp.nome = sc.nextLine();
        System.out.printf("Gross Salary: ");
        emp.GrossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        emp.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();

        System.out.printf("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();

    }
}