import java.util.Date;
import java.util.Scanner;
public class variables {
    public static void main(String []args){
       //primitive data types
        int num=8;//1bit
       int age=num;
       System.out.println("age "+num);
       String name="John";
       System.out.println("name "+name);
       char grade='A';
       System.out.println("grade "+grade);
       float ok=0.987f;
        System.out.printf("float value %.1f ",ok); 
        int size=94;
        System.out.println("\nsize "+size);
        Date today=new Date();
        System.out.print("time: " +today.getHours()+":"+today.getMinutes()+":"+today.getSeconds());
        System.out.println("\ntoday is "+today);
        Date today2=new Date();
        System.out.println("today2 is "+today2);
        int bankBalance=1000;
        System.out.println("bankBalance "+bankBalance);
        Scanner bank=new Scanner(System.in);
        int deposit=bank.nextInt();
        bankBalance+=deposit;
        System.out.println("bankBalance "+bankBalance);
    }
}