package oopsconcepts;
/*Encapsulation is the process of wrapping data (variables) and methods into a 
single unit (class) and restricting direct access to the data.

In Java, encapsulation is achieved by:

Making variables private.
Accessing or modifying them using public getter and setter methods.
          Student Class
+-------------------------------+
| private String name           |
| private int age               |
|-------------------------------|
| setName()                     |
| getName()                     |
| setAge()                      |
| getAge()                      |
+-------------------------------+
Class
│
├── Private Variables 🔒
│
└── Public Methods
      ├── Getter  → Read data
      └── Setter  → Update data 
      Encapsulation = Data Hiding + Controlled Access*/
class Student {

    private String name;
    private int age;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    // Getter
    public int getAge() {
        return age;
    }
}

public class encapsulation {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Rahul");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}