package packages.interfaces.q3;

public interface Swimmable {
    default void swim()
    {
        System.out.println("Swimmable");
    }
}
