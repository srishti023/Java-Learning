package packages.interfaces.q1;

public class Circle extends Shape{

    @Override
    double area(int r) {
        double area = 3.14*r*r;
        return area;
    }
}
