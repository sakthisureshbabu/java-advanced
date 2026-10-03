package threads;

// A Lambda method is used to create thread without creating a separate class by extending Thread
// It is useful for concise and simple tasks.

public class LambdaMethod {
    public static void main(String[] args) {
        // Lambda Thread created
        Thread thread1 = new Thread(() -> {
            // Operations performed for the thread 1.
            System.out.println("Lambda Thread running");
        });

        thread1.start();
    }
}