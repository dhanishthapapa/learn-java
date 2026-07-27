package collection.list;
import java.util.Random;
import java.util.Vector;
import java.util.Scanner;
/*A Vector is a dynamic array in Java that 
can grow or shrink automatically. It is similar
 to ArrayList, but all its methods are synchronized,
  making it thread-safe. 
 
  Use Vector when multiple threads access the same list and you need built-in synchronization.
  For most modern Java applications, ArrayList is preferred because it is faster. If thread safety
  is required, developers often use Collections.synchronizedList() or concurrent collections instead
  of Vector.
  
  Why use Vector?

Imagine a bank where two employees are updating customer details at the same time.

Employee 1: Deposits ₹5,000 into Rahul's account.
Employee 2: Withdraws ₹2,000 from Rahul's account.

If both access the list simultaneously, data can become
 inconsistent. Since Vector is synchronized, only one 
 thread can modify the vector at a time, helping prevent
  such issues.*/
class hospital{
    String name;
    String address;
    long phone;
    String doctor;
    int patientId;

}
public class vectors {
    Vector<hospital> setdata(Scanner sc, Random randam){
     Vector<hospital> list = new Vector<>();
     hospital h=new hospital();
     h.name=sc.nextLine();
     h.address=sc.nextLine();
     h.phone=sc.nextLong();
     sc.nextLine(); // consume the newline character
     h.doctor=sc.nextLine();
     h.patientId=randam.nextInt(1000);

     list.add(h);
     return list;
    }
    public static void main(String[] args) {
        Random randam = new Random();
        Vector<hospital> patients = new Vector<>();
        Scanner sc=new Scanner(System.in);
        vectors obj=new vectors();
        Vector<hospital> list = obj.setdata(sc,randam);
         for (hospital h : list) {
            System.out.println("Hospital Name : " + h.name);
            System.out.println("Address       : " + h.address);
            System.out.println("Phone         : " + h.phone);
            System.out.println("Doctor        : " + h.doctor);
            System.out.println("Patient ID    : " + h.patientId);
            System.out.println();
        }
    }
}
