package tax;

import java.util.Scanner;

public class DriverMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int empId =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Name: ");
        String Name = scanner.nextLine();
        System.out.println("Enter Employee salary: ");
        double salary = scanner.nextDouble();
        Employee emp = new Employee(empId, Name, salary);

        System.out.println("Enter product ID: ");
        int pid =scanner.nextInt();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter product quantity: ");
        int quantity = scanner.nextInt();
        product product = new product(pid, price, quantity);

        emp.calculateTax();
        product.calculateTax();
        scanner.close();

    }

}
