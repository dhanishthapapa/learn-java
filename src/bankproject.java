import java.util.Scanner;
class Bank{
        String customerName;
        int accountNumber;
        String accountType;
        double balance;
}
public class bankproject {

    
    //in this method we are creating account and taking input from user
    //so we are passing scanner object and bank object as parameter 
    void createAccount(Scanner bank,Bank b){
        //b refers to the object of class bankproject
        //bank refers to the object of scanner class which is created in main method
        b.customerName=bank.nextLine();
        b.accountNumber=bank.nextInt();
        b.accountType=bank.nextLine();
        b.balance=bank.nextDouble();
    }
    void existingAccount(Scanner bank, Bank b){
        System.out.println("you have selected existing account");
        System.out.println("please enter your name:");
        b. customerName=bank.nextLine();
        System.out.println("hello "+b.customerName);
        System.out.println("please enter your account number");
        b.accountNumber=bank.nextInt();
        System.out.println("please enter your account type");
        b.accountType=bank.nextLine();
        System.out.print(" for deposit press 1, for withdraw press 2, for check balance press 3");
        int choice=bank.nextInt();
        if(choice==1){
            deposit(bank,b);
        }
        else if(choice==2){
            withdraw(bank,b);
        }
        else if(choice==3){
            checkBalance(b);
        }
        else{
            System.out.println("invalid choice");
        }
    }
    void deposit(Scanner bank, Bank b){
        System.out.println("please enter the amount you want to deposit");
        double amount=bank.nextDouble();
        b.balance+=amount;
        System.out.println("your new balance is: "+b.balance);
    }
    void withdraw(Scanner bank, Bank b){
        System.out.println("please enter the amount you want to withdraw");
        double amount=bank.nextDouble();
        if(amount>b.balance){
            System.out.println("insufficient balance");
        }
        else{
            b.balance-=amount;
            System.out.println("your new balance is: "+b.balance);
        }
    }
    void checkBalance(Bank b){
        System.out.println("your balance is: "+b.balance);
    }



    public static void main(String []args){
        Scanner bank=new Scanner(System.in);
        //creating oject for bank class
        Bank b=new Bank();
        //create object for bankproject class
        bankproject obj= new bankproject();
        System.out.println("Welcome to the bank");
        System.out.println("===== BANK MANAGEMENT SYSTEM =====\r\n" + //
                        "1. Create Account\r\n" + //
                        "2. Display Account\r\n" + //
                        "3. Deposit Money\r\n" + //
                        "4. Withdraw Money\r\n" + //
                        "5. Check Balance\r\n" + //
                        "6. Exit\r\n" + //
                        "Enter your choice:");
        int choice=bank.nextInt();
        bank.nextLine();
        switch(choice){
            case 1:
                obj.createAccount(bank,b);
                break;
            case 2:
                obj.existingAccount(bank,b);
                break;
            case 3:
                obj.deposit(bank,b);
                break;
            case 4:
                obj.withdraw(bank,b);
                break;
            case 5:
                obj.checkBalance(b);
                break; 
            default:
                System.out.println("invalid choice");
        }
    } 
}
