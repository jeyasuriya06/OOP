package AbstractionUsingAbstractClass;

abstract class Animal {
    // Abstract method (Each animal have different sounds)
    abstract void makeSound();

    // Concrete method (Every animal sleeps)
    void sleep() {
        System.out.println("Sleeping");
    }
}
