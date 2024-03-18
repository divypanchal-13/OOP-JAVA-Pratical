/*
Create a class Employee which has two private data members name and salary and it has two public member functions named as getData() and putData() where getData() gets name and salary from the user putData() displays name and salary for any user.
 */
import java.util.Scanner;

public class Pratical_3_4 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.getData();
        employee.putData();
    }
}

 class Employee {
    private String name;
    private double salary;

    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        name = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        salary = scanner.nextDouble();
    }

    public void putData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}