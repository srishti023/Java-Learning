package packages.AccessModifiers.School;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Invalid salary!");
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}