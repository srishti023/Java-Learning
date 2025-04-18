package packages.interfaces.q2;

public abstract class Animal {

    Animal()
    {
        System.out.println("Animal created");
    }
    final void sound()
    {
        System.out.println("Animal make Sound!!!!!!!!");
    }
    static void info()
    {
        System.out.println("Animals are living being.");
    }
    abstract void habitat();
}
