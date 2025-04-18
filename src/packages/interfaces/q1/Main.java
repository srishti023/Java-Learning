package packages.interfaces.q1;

public class Main {
    public static void main(String args[])
    {
        Square sq = new Square();
        System.out.println(sq.area(5));
        Circle cr = new Circle();
        System.out.println(cr.area(1));
        Shape cs = new Circle();
        System.out.println(cs.area(1));

    }
}
