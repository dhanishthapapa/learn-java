package oopsconcepts.inheritances;
/*2. Multilevel Inheritance ✅

A child becomes the parent of another class.
human
   |
  mother
   |
 daughter */

class human {
    void eat() {
        System.out.println("Eating");
    }
}
class mother extends human {
    void talk() {
        System.out.println("Talking");
    }
}
class daughter extends mother {
    void play() {
        System.out.println("Playing");
    }
}
public class multilevelinheritance {
    public static void main(String args[]) {
        daughter d = new daughter();
        d.play();
        d.talk();
        d.eat();
        mother m = new mother();
        m.talk();
        m.eat();
        human h = new human();
        h.eat();
        
    }
}
