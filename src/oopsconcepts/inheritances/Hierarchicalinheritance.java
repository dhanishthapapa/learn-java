package oopsconcepts.inheritances;
/*3. Hierarchical Inheritance ✅

One parent has multiple children. 
      human
      /    \
    male    female*/
class human {
    void eat() {
        System.out.println("Eating");
    }
}
class male extends human {
    void work() {
        System.out.println("Working");
    }
}
class female extends human {
    void cook() {
        System.out.println("Cooking");
    }
}
public class Hierarchicalinheritance {
    public static void main(String args[]) {
       male m = new male();
       m.work();
       m.eat();
       female f = new female();
        f.cook();
        f.eat();
        //f.work(); // This line will cause a compile-time error because the female class does not have a work() method.
       human h = new human();
        h.eat();
        
    }
}
