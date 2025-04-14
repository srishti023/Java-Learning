package packages.level3;

public class course {
    String courseName;
    int courseDuration;
    int courseFees;

     course(String cName, int cDura, int cFee)
    {
        this.courseName=cName;
        this.courseDuration=cDura;
        this.courseFees=cFee;
    }
    void displayCourseDetails()
    {
        System.out.println("Course Name : "+this.courseName );
        System.out.println("Course Duration : "+this.courseDuration);
        System.out.println("Course Fees : "+this.courseFees);
    }
}
