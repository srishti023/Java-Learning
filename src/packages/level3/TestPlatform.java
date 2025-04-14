package packages.level3;

public class TestPlatform {
    public static void main(String args[])
    {
        JavaCourse JC = new JavaCourse();
        PythonCourse PC = new PythonCourse();
        JC.displayCourseDetails();
        JC.getLevel();

        System.out.println();
        PC.displayCourseDetails();
        PC.getCertification();
    }
}
