package packages.AccessModifiers.School;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Riya", 50000);
        System.out.println(e.getName() + " earns " + e.getSalary());
        e.setSalary(60000);
        System.out.println("Updated salary: " + e.getSalary());
    }
}