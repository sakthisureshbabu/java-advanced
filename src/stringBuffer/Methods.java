package stringBuffer;

public class Methods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Java programming");
        System.out.println(sb);

        // insert() at given position
        sb.insert(5, "is a fun filled ");
        System.out.println("After inserting: " + sb);

        // replace() method - replaces the given string from start to end index
        sb.replace(4, 5, "Script ");
        System.out.println("After replace: " + sb);

        // delete() method
        sb.delete(4, 10);
        System.out.println("Delete method: " + sb);

        // reverse()
        StringBuilder sb2 = new StringBuilder("Let's get something");
        System.out.println(sb2.reverse());

        // capacity()
        System.out.println("The capacity of sb2 = " + sb2.capacity());

        // length()
        System.out.println("The length of the sb2 = " + sb2.length());
    }
}
