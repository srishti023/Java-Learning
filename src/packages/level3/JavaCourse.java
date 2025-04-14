package packages.level3;

public class JavaCourse  extends course {
    void getLevel()
    {
        System.out.println("Begginer Level");
    }
    void displayCourseDetails()
    {
        super.displayCourseDetails();
        System.out.println("This is a Java course.");
    }
    JavaCourse() {
        super("Java Bootcamp", 30, 2000);  // pass valid args
    }
}
