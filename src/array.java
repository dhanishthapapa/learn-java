import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        // predefined array
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = i + 1;
        }

        System.out.println("Length: " + num.length);

        // print first array
        for (int i = 0; i < num.length; i++) {
            if (i == 5)
                System.out.println();
            System.out.print(num[i] + " ");
        }

        System.out.println("\n");
        Arrays.sort(num);
    System.out.println("Sorted array: " + Arrays.toString(num));
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        if (size != 10) {
            System.out.println("Size mismatch");
            return; // IMPORTANT
        }

        int[] arr = new int[size];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // sum of arrays
        int[] sum = new int[10];
        for (int i = 0; i < 10; i++) {
            sum[i] = num[i] + arr[i];
        }

        // print sum
        System.out.println("Sum of arrays:");
        for (int i = 0; i < 10; i++) {
            System.out.print(sum[i] + " ");
        }
       
        sc.close();
    }
}
