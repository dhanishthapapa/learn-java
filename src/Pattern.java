import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
     System.out.println("enter the number");
     Scanner ptrn =new Scanner(System.in);
     int a=ptrn.nextInt();
     for(int i=1;i<=a;i++){
       if (i % 2==0){
        System.out.println("even number"+i);
       }
       else{
        System.out.println("odd number"+i);
       }
     }
    }
}
