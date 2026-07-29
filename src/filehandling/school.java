package filehandling;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
class students{
    String name;
    int age ;
    String department;

}
public class school {
 public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    File file =new File("folder.txt");
  
    ArrayList<students> account = new ArrayList<>(); 
    students stu=new students();
    try{
    FileWriter fileWriter = new FileWriter("folder.txt");
    System.out.println("enter name:");
    stu.name=sc.nextLine();
    System.out.print("enter age:");
    stu.age=sc.nextInt();
    System.out.println("enter department:");
    sc.nextLine();
    stu.department=sc.nextLine();
    account.add(stu);


    fileWriter.write(stu.age + "," +
                 stu.name + "," +
                 stu.department + "\n");
    

    fileWriter.close();
    System.out.print("Data saved successfully.");//
    }
    catch (IOException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
 }
}
