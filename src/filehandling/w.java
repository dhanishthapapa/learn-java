package filehandling;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

class w {
    int age ;
    String name;
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String filePath = "src/filehandling/folder.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            fileWriter.write("Name: " + name + "\n");
            fileWriter.write("Age: " + age + "\n");
            fileWriter.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
