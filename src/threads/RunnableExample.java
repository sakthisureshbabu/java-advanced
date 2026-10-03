package threads;

class RunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside run method");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // Create an object of Runnable Target
        RunnableClass runnable = new RunnableClass();

        Thread thread_1 = new Thread(runnable, "runnable");
        thread_1.start();

        System.out.println("Using getName(): " + thread_1.getName());
        System.out.println("Using currentThread().getName(): " + thread_1.currentThread().getName());
    }
}
