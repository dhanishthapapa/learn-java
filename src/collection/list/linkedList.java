package collection.list;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.set(1, "JavaScript");
        list.addFirst("C#");
        list.addLast("Ruby");
        System.out.println(list);

        list.remove("Python");

        System.out.println(list);
    }
}
