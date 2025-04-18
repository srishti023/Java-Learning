package packages.interfaces.q3;

public interface Flyable {
    default void fly()
    {
        System.out.println("Flyable");
    }
}
