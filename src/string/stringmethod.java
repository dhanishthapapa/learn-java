package string;

public class stringmethod {
    public static void main(String[] args) {

        String str = "Java Programming";
        String str1 = "JAVA";
        String str2 = "java";
        String str3 = "Apple";
        String str4 = "Banana";
        String empty = "";

        System.out.println("Original String: " + str);

        System.out.println("Length: " + str.length());

        System.out.println("Character at index 2: " + str.charAt(2));

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Equals: " + str1.equals(str2));

        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));

        System.out.println("CompareTo: " + str3.compareTo(str4));

        System.out.println("Contains 'Java': " + str.contains("Java"));

        System.out.println("Starts With 'Java': " + str.startsWith("Java"));

        System.out.println("Ends With 'Programming': " + str.endsWith("Programming"));

        System.out.println("Substring(5): " + str.substring(5));

        System.out.println("Substring(0,4): " + str.substring(0, 4));

        System.out.println("Replace: " + str.replace("Java", "Python"));

        System.out.println("Index of 'g': " + str.indexOf('g'));

        System.out.println("Last Index of 'g': " + str.lastIndexOf('g'));

        String space = "   Hello Java   ";
        System.out.println("Trim: '" + space.trim() + "'");

        System.out.println("Is Empty: " + empty.isEmpty());

        System.out.println("Concat: " + str1.concat(" Programming"));

        String languages = "Java,Python,C++";
        String[] arr = languages.split(",");

        System.out.println("Split:");
        for (String s : arr) {
            System.out.println(s);
        }

        int number = 100;
        String value = String.valueOf(number);
        System.out.println("ValueOf: " + value);

        char[] chars = str.toCharArray();
        System.out.println("toCharArray:");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        System.out.println();
    }
}
