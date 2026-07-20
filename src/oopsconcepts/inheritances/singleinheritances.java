package oopsconcepts.inheritances;

/*1. Single Inheritance ✅

One child inherits from one parent. 
Animal
   |
  Dog
  
  
in this code the child class is Dog and the parent class is Animal
dog can bark and eat but not all animals can bark
so we use extends to access the properties and methods of the parent class*/
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
public class singleinheritances {
public static void main(String args[]) {
    Dog d = new Dog();
    d.bark();
    d.eat();
}
}