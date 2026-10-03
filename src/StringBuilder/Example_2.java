package StringBuilder;

// Common methods involved in StringBuilder

public class Example_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Intial: " + sb);

        sb.append(" is awesome.");
        System.out.println("After append: " + sb);

        sb.insert(8, "pretty ");
        System.out.println("After insert: " + sb);

        sb.replace(0, 4, "Programming");
        System.out.println("After replace: " + sb);

        sb.delete(15, 22);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    
        System.out.println("Cpapcity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        char c = sb.charAt(5);
        System.out.println("The character at index 5 of String builder: " + c);

        sb.setCharAt(5, 'E');
        System.out.println("After setCharAt: " + sb);

        String sub = sb.substring(5, 10);
        System.out.println("Substring (5-10): " + sub);

        sb.reverse();
        System.out.println("Index of 'is': " + sb.indexOf("is"));

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        System.out.println("Get class of sb: " + sb.getClass().getSimpleName());

        // convert StringBuilder class to String
        String result = sb.toString();
        System.out.println("Final Stiring: " + result);
    }
}
