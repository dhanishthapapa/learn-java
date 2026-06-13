import java.util.Date;
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
        System.out.printf("float value %.2f ",ok); 
 
        Date today=new Date();
        System.out.print("time: " +today.getHours()+":"+today.getMinutes()+":"+today.getSeconds());
            System.out.println("\ntoday is "+today);

    }
}
