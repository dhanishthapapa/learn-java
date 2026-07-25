package oopsconcepts;
/*A constructor is a special method that is called 
automatically when an object is created.

Its main purpose is to initialize (assign values to) 
the object's variables */
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class constructors {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 20);

        Student s2 = new Student(s1);

        s2.display();

    }

}
