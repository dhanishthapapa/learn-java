package oopsconcepts;
/*| Access Modifier           | Same Class | Same Package | Subclass (Different Package) | Different Package |
| ------------------------- | :--------: | :----------: | :--------------------------: | :---------------: |
| `private`                 |      ✅     |       ❌      |               ❌              |         ❌         |
| *(default)* (no modifier) |      ✅     |       ✅      |               ❌              |         ❌         |
| `protected`               |      ✅     |       ✅      |               ✅              |         ❌         |
| `public`                  |      ✅     |       ✅      |               ✅              |         ✅         |



Interview Definition
Private → Used to hide data from other classes.
Default → Accessible only within the same package.
Protected → Accessible within the same package and by subclasses.
Public → Accessible from anywhere in the program.


The keywords for access modifiers in Java are:

public
private
protected
default (there is no keyword for this)*/

class Student {

    private String name = "Rahul";// private access modifier
    int age = 20; // default access modifier
    protected String department="computer science"; // protected access modifier
    public String university="XYZ University"; // public access modifier
   
    private void display(String name) {
        System.out.println("Name: " + name);
    }
    // we can't access the private method directly from outside the class, so we create a public method to access it 
    public void show(String name) {
        this.name = name;
        display(name);   // Private method can be called inside the class
    }

    void setage(int age) {
        this.age = age;
        System.out.println("Age: " + age);
    }
    protected void setDepartment(String department) {
        System.out.println("Department: " + department);
    }
    public void setUniversity(String university) {
        System.out.println("University: " + university);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        // System.out.println(s.name);   // Error
        // s.display();                  // Error
        System.out.println(s.age);      // Accessible (default)
        System.out.println(s.department); // Accessible (protected)
        System.out.println(s.university); // Accessible (public)
       // System.out.println(s.name); // Error: name has private access in Student
        s.show("Alice");   // Correct
        s.setage(30);
        s.setDepartment("Mathematics");
        s.setUniversity("ABC University");
    }
}

