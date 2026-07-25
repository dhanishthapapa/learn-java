package execption_handling ;
/*The finally block contains code that 
always executes, whether an exception
occurs or not. It is commonly used to 
close files, database connections, or 
release other resources. 
finally is a block that always executes after the try and catch blocks*/
import java.io.FileReader;
import java.io.IOException;

public class finallys {
    public static void main(String[] args) {

        FileReader file = null;

        try {
            file = new FileReader("sample.txt");
            System.out.println("File opened successfully");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
        finally {
            try {
                if (file != null) {
                    file.close();
                    System.out.println("File closed");
                }
            }
            catch (IOException e) {
                System.out.println("Error while closing file");
            }
        }

        System.out.println("Program finished");
    }
}