package packages.level2;

public class Student {
    static String schoolName;
    String studentName;
    static{
        schoolName = " Sarvodaya Vidyalaya";
    }
    Student(){
        studentName="Srishti";
    }
    static void get()
    {
        Student s1 = new Student();
        System.out.println(s1.studentName+schoolName);
    }
    void getter()
    {
        System.out.println(studentName+schoolName);
    }

    public static void main(String args[])
    {
        get();
        Student s1 = new Student();
        s1.getter();
    }
}
