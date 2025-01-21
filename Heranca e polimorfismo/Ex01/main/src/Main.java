import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();


        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + i + ": ");
            System.out.print("Outsourced (y/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.println("Additional charge: ");
                Double additionalCharges = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharges));
            } else{
                list.add(new Employee(name, hours, valuePerHour));
            }

            System.out.println();
            System.out.println("PAYMENTS: ");
            for (Employee employee : list) {
                System.out.println(employee.getName() + "- $ " + String.format("$%.2f", employee.payment()));
            }

        }
        sc.close();
    }
}