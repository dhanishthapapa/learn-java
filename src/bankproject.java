import java.util.Scanner;
public class bankproject {
    public static void main(String []args){
        Scanner bank=new Scanner(System.in);
        System.out.println("Welcome to the bank");
        System.out.println("please enter your choice\n1. create account(c)\n2. existing account(e)");
        char choice=bank.next().charAt(0);
        bank.nextLine();
        if(choice=='c'){
            System.out.println("you have selected to create account");
            System.out.println("please enter your name:");
            String customerName=bank.nextLine();
            System.out.println("hello "+customerName);
        }
        else if(choice=='e'){
        System.out.println("you have selected existing account");
        System.out.println("please enter your name:");
        String customerName=bank.nextLine();
        System.out.println("hello "+customerName);
        System.out.println("please enter your account number");
        }
          else{
            System.out.println("invalid choice");
        }
    }
}
