package enumeration;

import java.util.Enumeration;
import java.util.Hashtable;

public class Example_2 {
    public static void main(String[] args) {
        Hashtable<Integer, String>map = new Hashtable<>();
        
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        Enumeration<Integer> keys = map.keys();
        Enumeration<String> elements = map.elements();

        System.out.println("Iteration of key-value pairs: ");
        // Iteration over keys of map
        while(keys.hasMoreElements()) {
            int key = keys.nextElement();
            System.out.println(key + "-> " + map.get(key));
        }

        System.out.println("Iteration of elements:");
        // Iteration of elements
        while(elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
    }
}
