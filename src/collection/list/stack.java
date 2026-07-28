package collection.list;

import java.util.Stack;

/*A Stack is a Last In, First Out (LIFO) data structure.

LIFO = Last In, First Out

The last element added is the first element removed.
Top
 ┌───────┐
 │ Plate3│ ← Removed first
 ├───────┤
 │ Plate2│
 ├───────┤
 │ Plate1│ ← Added first
 └───────┘ */
public class stack {
    public static void main(String[] args) {

        Stack<Integer> stacks = new Stack<>();

        stacks.push(10);
        stacks.push(20);
        stacks.push(30);

        System.out.println(stacks);
        System.out.println(stacks.pop());
        System.out.println(stacks.empty());
        System.out.println(stacks.search(20));
    }
}
