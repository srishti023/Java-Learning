package packages.practice;

//Create a program which:
//Uses an inner class to compute square of a number
// Uses a static variable to keep track of how many times that function is used
//Throws a custom error if input number is negative
public class practice {
    static class Square
    {
        static int count;
        int square(int num){
            if(num<0)
            {
                System.out.println("input number is negative");
                count++;
                return 0;
            }
            count++;
            System.out.println(num*num);
            return 1;
        }
    }
    public static void main(String args[])
    {
        Square n = new Square();
        n.square(2);
        n.square(3);
        n.square(-1);
        n.square(5);
        n.square(6);
        n.square(-2);
        System.out.println("Number of times function run : "+Square.count);
    }
}
