package threads;

class ThreadImp1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executed.");
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executed.");
    }
}

public class Example2 {
    public static void main(String[] args) {
        ThreadImp1 t1 = new ThreadImp1();
        t1.start();

        Thread t2 = new Thread(new RunnableThread());
        t2.start();

        // Wait for both threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}