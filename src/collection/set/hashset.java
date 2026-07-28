package collection.set;
import java.util.HashSet;
/*A HashSet is a class in the Java Collections
 Framework that stores unique elements. 
 It does not allow duplicates and does not maintain 
 insertion order. */
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashSets = new HashSet<>();
        hashSets.add(10);
        hashSets.add(20);
        hashSets.add(30);
        hashSets.add(10); // This will not be added as it's a duplicate
        hashSets.remove(30);
        hashSets.add(40);
        System.out.println("HashSet contains 20: " + hashSets.contains(20));
        System.out.println("HashSet size: " + hashSets.size());
        System.out.println("HashSet is empty: " + hashSets.isEmpty());
        System.out.println("HashSet elements: ");
        System.out.println(hashSets);
    }
}
    

