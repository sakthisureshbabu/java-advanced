package threads;

class ChefTask implements Runnable {
    private String dish;

    ChefTask(String dish) {
        this.dish = dish;
    }

    public void run() {
        System.out.println(this.dish + " is being prepared by " + Thread.currentThread().getName());
    }
}

public class Resort {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ChefTask("Hamburger"));
        Thread t2 = new Thread(new ChefTask("Seafood boil"));
        Thread t3 = new Thread(new ChefTask("Lobster grill"));

        t1.start();
        t2.start();
        t3.start();
    }
}