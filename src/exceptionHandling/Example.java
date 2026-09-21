package exceptionHandling;

public class Example {
    static void voterEligible(int age) {
        // throw - used inline to throw a single exception
        if (age > 18) {
            System.out.println("Eligible to vote.");
        }
        else
            throw new IllegalArgumentException("Not eligible to vote.");
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception occured:" + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Program continues");

        try {
            voterEligible(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }
}