import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExQueue {

     public static void main(String[] args) {
       //Queue
       Queue<String> queue = new LinkedList<String>();

       queue.offer("John");
       queue.offer("Chad");
       queue.offer("Steve");
       queue.offer("Harold");

       if(queue.isEmpty()){
         System.out.println("The queue is empty!");
       }
       
       System.out.println("***************************");
       System.out.println(queue);
       System.out.println("Queue size: " + queue.size());
       System.out.println(queue.peek());
       System.out.println("***************************");
       
       queue.poll();

       System.out.println(queue);
       System.out.println("Queue size: " + queue.size());
       System.out.println(queue.contains("John"));
       System.out.println("***************************");

        //Priority Queue
       // Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());
       Queue<Double> queue2 = new PriorityQueue<>();

        queue2.offer(3.0);
        queue2.offer(2.5);
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.0);

        while (!queue2.isEmpty()) {
          System.out.println(queue2.poll());
        }

       System.out.println("***************************");

        Queue<String> queue3 = new PriorityQueue<>();

        queue3.offer("B");
        queue3.offer("C");
        queue3.offer("A");
        queue3.offer("F");
        queue3.offer("D");

        while (!queue3.isEmpty()) {
          System.out.println(queue3.poll());
        }

     }
    
}
