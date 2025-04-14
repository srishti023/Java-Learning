package packages.level3;

public class PythonCourse extends course {
    void getCertification()
    {
        System.out.println("Free Certification Available!");
    }
    PythonCourse() {
        super("Python Bootcamp", 30, 3000);  // pass valid args
    }
}
