package packages.a;

class Student

{
    int rollno;
    String name;
    static int noStu =0; //Static Variable gets memory once

    Student(int r,String n)
    {
        rollno = r;
        name = n;
        noStu+=1;
    }

    /*Method For Displaying Student Details*/
    void display()
    {
        System.out.println(rollno+" "+name+" "+noStu);
    }

    public static void main(String args[])
    {
        Student s1 = new Student(101,"Gagan");
        Student s2 = new Student(102,"Raman");
        Student s3 = new Student(103,"Srishti");
        Student s4 = new Student(104,"Tripti");
        Student s5 = new Student(105,"Harshit");
        Student s6 = new Student(106,"Sneha");
        Student s7 = new Student(107,"Gauri");
        Student s8 = new Student(108,"Ashu");
        Student s9 = new Student(109,"Mummy");
        Student s10 = new Student(110,"Papa");
        s10.display();
    }

}
