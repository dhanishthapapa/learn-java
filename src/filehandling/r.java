package filehandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Students {
    String name;
    int age;
    String department;
}

 class library {

    static ArrayList<Students> account = new ArrayList<>();

    static Students getStudent(Scanner sc) {
        Students stu = new Students();

        System.out.print("Enter Name: ");
        stu.name = sc.nextLine();

        System.out.print("Enter Age: ");
        stu.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        stu.department = sc.nextLine();

        return stu;
    }

    static void writeToFile(Students stu) {
        try {
            FileWriter writer = new FileWriter("folder.txt", true);

            writer.write(stu.name + "," +
                         stu.age + "," +
                         stu.department + "\n");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void displayStudents() {
        System.out.println("\nStudent Details");
        for (Students s : account) {
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("Department: " + s.department);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Students stu = getStudent(sc);

        account.add(stu);

        writeToFile(stu);

        displayStudents();

        sc.close();
    }
}