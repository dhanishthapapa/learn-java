package oopsconcepts.inheritances;
/*Hybrid inheritance is a combination of two or more types of inheritance, such as:

Single + Hierarchical
Multilevel + Multiple
Single + Multiple 
        Animal
        /    \
      Dog    Cat
        \    /
       PetAnimal*/
interface Animals {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animals {

    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }
}

class Puppy extends Dog implements Pet {

    @Override
    public void play() {
        System.out.println("Puppy plays.");
    }
}

public class Hybridinheritance {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.play();
    }
}

