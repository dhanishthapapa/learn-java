//package collection.queue.java;
import java.util.PriorityQueue;
import java.util.Scanner;
/*A PriorityQueue is a class in the Java 
Collections Framework that implements the 
Queue interface. 
Unlike a normal queue (FIFO), a PriorityQueue
stores elements according to their priority.
Unlike a normal queue (FIFO), a PriorityQueue 
stores elements according to their priority.

PriorityQueue<Integer> pq = new PriorityQueue<>();*/
public class pqueue {
    

 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            pq.offer(sc.nextInt());
        }

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Peek: " + pq.peek());

        System.out.println("Removed: " + pq.poll());

        System.out.println("After Removal: " + pq);

        sc.close();
    }
}