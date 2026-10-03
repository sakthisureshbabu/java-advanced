package stringBuffer;

public class Example_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("Hello");
        sb.append(" ");
        sb.append("world");

        System.out.println(sb);
        System.out.println("Type: " + sb.getClass().getSimpleName());

        // typecast to string
        System.out.println("String type: " + sb.toString().trim());
    }
}