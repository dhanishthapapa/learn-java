import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
     System.out.println("enter the number");
     Scanner ptrn =new Scanner(System.in);
    /* int a=ptrn.nextInt();
       int event=0;
      for(int i=1;i<=a;i++){
       if (i % 2==0){
        event=event+1;
       // System.out.println("even number"+i);
       }
       else{
       // System.out.println("odd number"+i);
       }
     }
     System.out.println("total even numbers: "+event);
     for (int i=0;i<=a;i++){
       for (int j=0;j<=i;j++){
         if(i==0||i==a-1||j==0||j==a-1)
         System.out.println("* ");
         else if(i==j||i+j==a-1)
         System.out.println("* ");
         else
         System.out.println(" ");
       }
       */
              int n = ptrn.nextInt();

        // Tree leaves
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Tree trunk
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
     }
    }

