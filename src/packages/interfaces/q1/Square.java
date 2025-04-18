package packages.interfaces.q1;

public class Square extends Shape{
    @Override
    double area(int side) {
        double area = side*side;
        return area;
    }
}
