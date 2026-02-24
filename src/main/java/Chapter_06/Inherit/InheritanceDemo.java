package Chapter_06.Inherit;

public class InheritanceDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.sleep();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();
    }
}
