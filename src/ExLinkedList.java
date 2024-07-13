import java.util.LinkedList;

/**
 * ExLinkedList
 */
public class ExLinkedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");

        System.out.println(linkedList);

        linkedList.pop();

        System.out.println(linkedList);

        linkedList.add(4, "K");
        linkedList.remove("B");

        linkedList.addFirst("0");

        linkedList.addLast("W");

        linkedList.remove("D");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);
    }

    
}