import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> persons = new HashMap<>();
        persons.put(1, "Sjaak Polak");
        persons.put(2, "Coen Jansen");
        persons.put(3, "Hendrik El-Mecky");

        System.out.println("De persoon met BSN-nummer 1 is: " + persons.get(1));
        System.out.println("De persoon met BSN-nummer 2 is: " + persons.get(2));

/*
        persons.put(33, "Onbekend Doe");
        System.out.println("De persoon met BSN-nummer 33 is: " + persons.get(33));
        System.out.println("Aantal entries in persons: " + persons.size());
        persons.remove(33);
        System.out.println("Aantal entries in persons: " + persons.size());
        persons.clear();
        System.out.println("Aantal entries in persons: " + persons.size());
*/

    }
}

