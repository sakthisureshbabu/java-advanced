// Emumeration interface in java is one of the legacy interface used to iterate over elements of Stack, Vector and HashTable
// It has legacy cursor used before Iterator and ListIterator supports only forward directional traversal.
// Not a fail-fast, so it doesn't trhow ConcurrentModificationException even if the collection is modified during iteration.

// Creating a new enumeration using vector

package enumeration;

import java.util.Vector;
import java.util.Enumeration;

public class Example_1 {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Geeting enumeration object
        Enumeration<String> enumeration = fruits.elements();

        System.out.println("Elements of Vector:");
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}