import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
class Bank{
      
    String customerName;
    int accountNumber;
    String accountType;
    double balance;
}
public class bankproject {
    /*Bank = one customer.
      accounts = a list that stores many customers. */
  ArrayList<Bank> Account=new ArrayList<Bank>();
    
    //in this method we are creating account and taking input from user
    //so we are passing scanner object and bank object as parameter 
    void createAccount(Scanner bank,Bank b){
        //b refers to the object of class bankproject
        /*If your bank will only ever have one customer, then using b is perfectly fine.
        If your bank should support many customers, then each customer needs their own Bank object. */
       Bank custome = new Bank();
        //bank refers to the object of scanner class which is created in main method
       System.out.print("Enter Customer Name: ");
        custome.customerName=bank.nextLine();
        System.out.print("Enter Account Number: ");
        custome.accountNumber=bank.nextInt();
        bank.nextLine(); // consume the newline character
        System.out.print("Enter Account Type:(Savings/Current) ");
        custome.accountType=bank.nextLine();
        System.out.print("Enter Initial Balance: ");
        custome.balance=bank.nextDouble();
        Account.add(custome);
        saveAccounts();
        System.out.println("Account created successfully for "+custome.customerName);
        /*Because findAccount() is supposed to return a Bank object.
    The word before the method name (Bank) is the return type.*/}
    Bank findAccount(int accountNumber) {

        for (Bank customer : Account) {
            if (customer.accountNumber == accountNumber) {
                return customer;
            }
        }
        return null; // Account not found
    }

    void existingAccount(Scanner bank) {

    System.out.println("Enter Account Number:");
    int accountNumber = bank.nextInt();

    Bank customer = findAccount(accountNumber);

    if (customer != null) {

        System.out.println("Welcome " + customer.customerName);

        System.out.println("Account Type : " + customer.accountType);
        System.out.println("Balance : " + customer.balance);

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        int choice = bank.nextInt();

        switch (choice) {

            case 1:
                deposit(bank);
                break;

            case 2:
                withdraw(bank);
                break;

            case 3:
                checkBalance(bank);
                break;

            default:
                System.out.println("Invalid Choice");
        }

    } else {

        System.out.println("Account not found.");

    }
}
    void deposit(Scanner bank){
        System.out.println("you have selected deposit");
        System.out.println("please enter your account number:");
        int accountNumber=bank.nextInt();
        Bank customer=findAccount(accountNumber);
        if(customer!=null){
            System.out.println("please enter the amount you want to deposit");
            double amount=bank.nextDouble();
            customer.balance+=amount;
            saveAccounts();
            System.out.println("your new balance is: "+customer.balance);
        }
        else{
            System.out.println("Account not found");
        }
    }
    void withdraw(Scanner bank){
        System.out.println("you have selected withdraw");
        System.out.println("please enter your account number:");
        int accountNumber=bank.nextInt();
        Bank customer=findAccount(accountNumber);
        if(customer==null){
            System.out.println("Account not found");
        }
        else{
            System.out.println("please enter the amount you want to withdraw");
            double amount=bank.nextDouble();
            if(amount>customer.balance){
                System.out.println("insufficient balance");
            }
            else{
                customer.balance-=amount;
                saveAccounts();
                System.out.println("your new balance is: "+customer.balance);
            }
        }
    }
    void checkBalance(Scanner bank){
        System.out.println("you have selected check balance");
        System.out.println("please enter your account number:");
        int accountNumber=bank.nextInt();
        Bank customer=findAccount(accountNumber);
        if(customer!=null){
            System.out.println("your balance is: "+customer.balance);
        }
        else{
            System.out.println("Account not found");
        }
    }

    void saveAccounts() {
    try {
        FileWriter writer = new FileWriter("accounts.txt");

        for (Bank customer : Account) {
            writer.write(customer.customerName + ",");
            writer.write(customer.accountNumber + ",");
            writer.write(customer.accountType + ",");
            writer.write(customer.balance + "\n");
        }

        writer.close();
        System.out.println("Accounts saved successfully.");

    } catch (IOException e) {
        System.out.println("Error saving file.");
    }
}
void loadAccounts() {

    try {

        File file = new File("accounts.txt");

        if (!file.exists()) {
            return;
        }

        Scanner fileReader = new Scanner(file);

        while (fileReader.hasNextLine()) {

            String line = fileReader.nextLine();

            String[] data = line.split(",");

            Bank customer = new Bank();

            customer.customerName = data[0];
            customer.accountNumber = Integer.parseInt(data[1]);
            customer.accountType = data[2];
            customer.balance = Double.parseDouble(data[3]);

            Account.add(customer);
        }

        fileReader.close();

    } catch (Exception e) {

        System.out.println("Error loading accounts.");

    }

}
    public static void main(String []args){
        Scanner bank=new Scanner(System.in);
        //creating object for bank class use to get the wheather the user has account or not and to get the details of the user
        Bank b=new Bank();
        //create object for bankproject class to call the method in the same class
        bankproject obj= new bankproject();
        obj.loadAccounts();
        System.out.println("Welcome to the bank");
        while(true){
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
                obj.existingAccount(bank);
                break;
            case 3:
                obj.deposit(bank);
                break;
            case 4:
                obj.withdraw(bank);
                break;
            case 5:
                obj.checkBalance(bank);
                break; 
            default:
                System.out.println("invalid choice");
        }
    } 
 }
}
