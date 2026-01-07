package Inheritance;

class Employee {
    Employee() {
        System.out.println("Employee created");
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager created");
    }
}

