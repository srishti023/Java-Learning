package packages.level4;

class Student extends Person {
    private int rollNumber;
    private double  marks;

    public Student(String name, int age, int rollNumber, double marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else return "B";
    }

    public String calculateGrade(double[] subjectMarks) {
        double total = 0;
        for (double mark : subjectMarks) {
            total += mark;
        }
        double avg = total / subjectMarks.length;
        return calculateGrade();
    }

    @Override
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to the Student Management System!");
    }
}
