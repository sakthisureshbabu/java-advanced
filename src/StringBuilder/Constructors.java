package StringBuilder;

public class Constructors {
    public static void main(String[] args) {
        // Default capacity of 16 characters.
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello");
        System.out.println(sb1);

        // Creates with specified capacity
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("This has initial capacity 50");
        System.out.println(sb2);

        // Initializes with the specified String
        StringBuilder sb3 = new StringBuilder("Let's learn StringBuilder. ");
        sb3.append("Using Demo");
        System.out.println(sb3);

        // Using Character sequence
        CharSequence cs = "Java";
        StringBuilder sb4 = new StringBuilder(cs);
        sb4.append(" Programming");
        System.out.println(sb4);
    }
}
