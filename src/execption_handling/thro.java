package execption_handling;
import java.util.Scanner;
public class thro{
 public static void main(String[] agrs){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a name: ");
   String name = sc.nextLine();
   if(name.length()==0){
    
    throw new IllegalArgumentException("Name cannot be empty");
   }
   else{
    System.out.println("Hello, " + name);
   }
   System.out.print("Enter your email: ");
   String email = sc.nextLine();
   if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$")) {
            System.out.println("Valid Email");
        } else {
            throw new IllegalArgumentException("Invalid Email");
        }
        

 }   
}
