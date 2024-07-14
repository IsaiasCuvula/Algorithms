import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayList {
    public static void main(String[] args) throws Exception {
        // DynamicArray dynamicArray = new DynamicArray(5);

        // dynamicArray.add("A");
        // dynamicArray.add("B");
        // dynamicArray.add("V");
        // dynamicArray.add("C");
        // dynamicArray.add("D");

        // dynamicArray.insert(0, "X");

        // dynamicArray.delete("D");
        // dynamicArray.delete("X");
        // dynamicArray.delete("V");

        //int result =  dynamicArray.search("C");

        // System.out.println(dynamicArray);
        // System.out.println("size: " + dynamicArray.size);
        // System.out.println("capacity: " + dynamicArray.capacity);
        // System.out.println("empty: " + dynamicArray.isEmpty());
        // System.out.println("index of C is: " + result);

   
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        // *********************LinkedList*********************
        startTime = System.nanoTime();

        //do something
        //linkedList.get(0);
       //linkedList.get(5000);
       //linkedList.get(999999);
       //linkedList.remove(500000);
       linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");
        // *********************ArrayList*********************

         startTime = System.nanoTime();

        //do something
       // arrayList.get(0);

        //arrayList.get(5000);
        //arrayList.get(999999);

        // arrayList.remove(500000);
        arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}