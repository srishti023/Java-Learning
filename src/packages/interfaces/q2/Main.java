package packages.interfaces.q2;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.habitat();
        dog.sound();

        Animal tiger = new Tiger();
        tiger.habitat();
        tiger.sound();
        Animal.info();
    }
}
