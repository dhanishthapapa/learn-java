package oopsconcepts;
//CLASS
//class is the bliue print of object
/*You can write everything in one class, but it's not a 
good practice for medium or large programs.*/
/*When should you use multiple classes?

Use multiple classes when:

Building a project
Following OOP principles
Working in a team
The program starts getting large
Different parts of the program have different responsibilities */
/*Why Companies Use Multiple Classes
 Because every class has a specific responsibility.*/

//OBJECT
//object is the instance of class
/*The purpose of an object is to represent a real thing and store its 
own data while performing its own actions. 

The main purposes of objects
Store data for one specific entity.
Perform actions using methods.
Keep data separate for different entities.
Allow code reuse by creating many objects from one class.

SYNTAX OF OBJECT CREATION
ClassName objectName = new ClassName();

Student s1 = new Student();

Stack                  Heap
-----                  -----------------
s1  ----------------->  Student Object
                         name = null
                         age = 0
                         
After assigning values:                         
s1.name = "Rahul";
s1.age = 20;                  


Stack                  Heap
-----                  -----------------
s1  ----------------->  Student Object
                         name = "Rahul"
                         age = 20*/
/*in this i have declear an variable as a gloable variable 
to access that we create objects */


import java.util.Scanner;
class department{
    String departmentName;
    String course;
    int rollNumber;
}
public class co {
    String name;
    int age;
    public static void main(String[] args) {
        co s1 = new co();// creating object of class co
        s1.name = "Rahul";// assigning value to name variable
        s1.age = 20;
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);


        // directly creating object of class department and assigning values to its variables   
        department d1 = new department();// creating object of class department
        d1.departmentName = "Computer Science";// assigning value to departmentName variable
        d1.course = "Java Programming";
        d1.rollNumber = 101;
        System.out.println("Department Name: " + d1.departmentName);
        System.out.println("Course: " + d1.course);
        System.out.println("Roll Number: " + d1.rollNumber);

        // getting values from user for variables using object of class department
        Scanner sc = new Scanner(System.in);
        department d2 = new department();// creating object of class department
        System.out.print("Enter Department Name: ");
        d2.departmentName = sc.nextLine();// assigning value to departmentName variable
        System.out.print("Enter Course: ");
        d2.course = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        d2.rollNumber = sc.nextInt();

        System.out.println("Department Name: " + d2.departmentName);
        System.out.println("Course: " + d2.course);
        System.out.println("Roll Number: " + d2.rollNumber);
    }
}
