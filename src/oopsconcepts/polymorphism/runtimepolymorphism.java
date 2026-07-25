package oopsconcepts.polymorphism;
/*
Polymorphism means "many forms."  
2. Run-time Polymorphism (Method Overriding)

Method overriding means a child class provides its own 
implementation of a parent class method.  */
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class runtimepolymorphism {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}