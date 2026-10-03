package threads;

class MyThread extends Thread {
    // Naming thread instead of default Thread-1 or Thread-0
    MyThread(String name) {
        // Invoking Thread constructor
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + "- Count" + i);
        
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }
}

public class ThreadCreate {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Lamborgini");
        MyThread thread2 = new MyThread("Ferrari");

        // Start thread 1
        thread1.start();

        // Start thread 2
        // Changing name of thread using setName()
        thread2.setName("Mitsubishi");

        thread2.start();
    }
}
