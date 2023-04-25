//Create a class named 'Member' having the following members: Name, Age, Phone number, Address,
//Salary. It also has a method named 'printSalary' which prints the salary of the members. Two classes
//'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have
//data members 'specialization' and 'department' respectively. Now, assign name, age, phone number,
//address and salary to an employee and a manager by making an object of both of these classes and print the same.
import java.util.Scanner;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter employee name:");
        employee.name = scanner.nextLine();
        System.out.println("Enter employee age:");
        employee.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee phone number:");
        employee.phoneNumber = scanner.nextLine();
        System.out.println("Enter employee address:");
        employee.address = scanner.nextLine();
        System.out.println("Enter employee salary:");
        employee.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter employee specialization:");
        employee.specialization = scanner.nextLine();

        // Creating an object of Manager class and setting the member variables
        Manager manager = new Manager();
        System.out.println("Enter manager name:");
        manager.name = scanner.nextLine();
        System.out.println("Enter manager age:");
        manager.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter manager phone number:");
        manager.phoneNumber = scanner.nextLine();
        System.out.println("Enter manager address:");
        manager.address = scanner.nextLine();
        System.out.println("Enter manager salary:");
        manager.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter manager department:");
        manager.department = scanner.nextLine();

        // Printing the details of employee and manager
        System.out.println("\nEmployee details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
    }
}
