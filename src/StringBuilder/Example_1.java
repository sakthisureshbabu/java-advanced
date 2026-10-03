package StringBuilder;

// Unlike String, its contents can be modified without creating new object every operation.

public class Example_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is a StringBuilder. ");
        sb.append("Let's deep dive");
        System.out.print(sb);
    }
}
