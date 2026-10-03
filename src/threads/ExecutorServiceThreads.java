package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ExecuterService is a framework that manages and executes thread through thread pool.
// It provides more efficient and scalable approach to multithreading than creating thread manually.
// Uses a pool of reusable threads, simplifies thread management suitable for executing multiple tasks concurrently.
// Manages lifecycle of thread automatically, improving performance and resource usage

public class ExecutorServiceThreads {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService threads = Executors.newFixedThreadPool(3);

        // Submitting Threads as Runnable
        threads.submit(() -> {
            System.out.println("Taks 1 is running in " + Thread.currentThread().getName());
        });

        threads.submit(() -> {
            System.out.println("Task 2 is running in " + Thread.currentThread().getName());
        });

        threads.submit(() -> {
            System.out.println("Task 3 is running in " + Thread.currentThread().getName());
        });
    
        // Shutdown the thread/executor
        threads.shutdown();
    }
}
