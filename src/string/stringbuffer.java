package string;
/*StringBuffer is a class in Java used to create mutable 
(modifiable) strings. Unlike String, you can change 
the contents of a StringBuffer object without creating 
a new object. */
public class stringbuffer {
     public static void main(String[] args) {

        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original String: " + sb);

        // 1. append()
        sb.append(" Programming");
        System.out.println("After append(): " + sb);

        // 2. insert()
        sb.insert(5, "Core ");
        System.out.println("After insert(): " + sb);

        // 3. replace()
        sb.replace(5, 10, "Advanced ");
        System.out.println("After replace(): " + sb);

        // 4. delete()
        sb.delete(5, 14);
        System.out.println("After delete(): " + sb);

        // 5. deleteCharAt()
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt(): " + sb);

        // 6. charAt()
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 7. setCharAt()
        sb.setCharAt(0, 'j');
        System.out.println("After setCharAt(): " + sb);

        // 8. length()
        System.out.println("Length: " + sb.length());

        // 9. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 10. reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // 11. toString()
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
