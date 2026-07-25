package oopsconcepts;
/* An interface is a blueprint (or contract) that tells a class
 what methods it must have, but not how those methods work.

The class that implements the interface provides the actual
 implementation.*/
interface Animal {

    void eat();
}

class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats meat.");
    }
}

public class interfaces {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
    }
}
