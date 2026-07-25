package oopsconcepts.polymorphism;


/*
Polymorphism means "many forms."

Poly = Many
Morph = Forms

It means the same method name can perform different 
actions depending on the object or parameters.
1. Compile-time Polymorphism (Method Overloading)

Method overloading means multiple methods have the
same name but different parameters. 
Why is this called compile-time polymorphism?

The compiler decides which add() method to call 
based on the number and type of arguments.*/
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class compiletimepolymorphism {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(10.5, 20.5));

    }
}



