import java.util.Hashtable;

public class  HashTables {

    public static void main(String[] args) {
        // Hashtable<Integer, String> table = new Hashtable<>(10);
        // table.put(100, "Spongebob");
        // table.put(123, "John");
        // table.put(321, "Gary");
        // table.put(234, "Matheus");
        // table.put(888, "Josias");
        // table.put(555, "Jo");
        // table.put(116, "Sandy");
        // table.put(777, "Josy");

        // table.remove(116);

        // for (Integer key : table.keySet()) {
        //     System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        // }
        // ********************** String keys ****************
        Hashtable<String, String> tableString = new Hashtable<>();

        tableString.put("100", "Spongebob");
        tableString.put("123", "John");
        tableString.put("321", "Gary");
        tableString.put("234", "Matheus");
        tableString.put("888", "Josias");
        tableString.put("555", "Jo");
        tableString.put("116", "Sandy");
        tableString.put("777", "Josy");

        tableString.remove("116");

        for (String key : tableString.keySet()) {
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + tableString.get(key));
        }
    }
    
}
