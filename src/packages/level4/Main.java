package packages.level4;

public class Main {
    public static void main(String[] args) {

        Student.welcomeMessage();

        Person[] people = new Person[2];
        people[0] = new Student("Riya", 20, 101, 89.5);
        people[1] = new Teacher("Mr. Sharma", 40, "T001", "Mathematics");

        for (Person p : people) {
            p.displayDetails();
        }

        Admin admin = new Admin();
        admin.showAdminAccess();
    }
}

