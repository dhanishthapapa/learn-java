package collection.set;
import java.util.LinkedHashSet;
import java.util.Scanner;
/*A LinkedHashSet is a class in the Java Collections
 Framework that stores unique elements and maintains 
 the insertion order. */
public class linkedhash {
    void operationset(Scanner sc) {
        LinkedHashSet<Integer> linkedHashSets = new LinkedHashSet<>();
        linkedhash j=new linkedhash();
         System.out.print("How many elements do you want to enter? ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            linkedHashSets.add(value);   // Duplicate values are ignored
        }

        System.out.println("\nLinkedHashSet elements: " + linkedHashSets);

        System.out.print("Enter a value to search: ");
        int search = sc.nextInt();

        System.out.println("Contains " + search + ": " + linkedHashSets.contains(search));
        System.out.println("Size: " + linkedHashSets.size());
        System.out.println("Is Empty: " + linkedHashSets.isEmpty());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedhash obj = new linkedhash();
        obj.operationset(sc);
}
}
