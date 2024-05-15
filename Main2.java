package forGit;
 

abstract class Employyee {
    protected String name;
    protected int employeeId;

    public Employyee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employyee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmeer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Programmeer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    void displayInfo() {
        String name = null;
		System.out.println("Programmer Name: " + name);
        String employyeeId = null;
		System.out.println("Employee ID: " + employyeeId);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Main2 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1001, 5000, 1000);
        manager.displayInfo();

        System.out.println();

        Programmeer programmer = new Programmeer("Tayler Swift", 1002, 50, 160);
        programmer.displayInfo();
    }
}
