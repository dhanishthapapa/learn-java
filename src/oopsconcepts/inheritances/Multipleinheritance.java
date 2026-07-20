package oopsconcepts.inheritances;
/*4. Multiple Inheritance ✅

Java does not support multiple inheritance directly,
 but it can be achieved using interfaces.

 An interface in Java is a blueprint (or contract) that contains method
  declarations. 
 Any class that implements the interface must provide implementations 
 for those methods. It is used to achieve abstraction and supports multiple 
 inheritance through interfaces.

           Animal (Interface)
             /        \
            /          \
     Omnivore      Herbivore


 implements keyword
 Method overriding
default and static methods in interfaces (Java 8+)
 


| Class                                         | Interface                                       |
| --------------------------------------------- | ----------------------------------------------- |
| Can contain variables and implemented methods | Defines a contract for behavior                 |
| Create objects from it (unless abstract)      | Cannot create objects directly                  |
| Uses `extends` for inheritance                | Classes use `implements` to follow an interface |
| A class can extend only one class             | A class can implement multiple interfaces       |
*/


interface Animals {
    void eat();
}

class Omnivore implements Animals {

    @Override
    public void eat() {
        System.out.println("Omnivore eats both plants and meat.");
    }
}

class Herbivore implements Animals {

    @Override
    public void eat() {
        System.out.println("Herbivore eats only plants.");
    }
}

public class Multipleinheritance {

    public static void main(String[] args) {

        Omnivore o = new Omnivore();
        Herbivore h = new Herbivore();

        o.eat();
        h.eat();
    }
}