
import java.lang.*;

class Marvellous implements Runnable {

    public void run() // Ruuning
    {
        try {
            System.out.println("Inside run method for thread with id: " + Thread.currentThread().getId());

            for (int i = 1; i <= 5; i++) {
                System.out.println("Inside thread: " + Thread.currentThread().getId() + " " + i);
                Thread.sleep(10000); // waiting

            }
        } catch (Exception ref) {
            System.out.println("Exception occured in threading");
        }

    }
    // All Threads goes into dead state
}

class Love {
    public static void main(String arr[]) {
        System.out.println(Thread.currentThread().getName()); // main
        System.out.println(Thread.currentThread().getId()); // 1

        Marvellous mobj1 = new Marvellous(); // New thread creation state
        Thread t1 = new Thread(mobj1); // 14

        Marvellous mobj2 = new Marvellous();
        Thread t2 = new Thread(mobj2); // 13

        Marvellous mobj3 = new Marvellous();
        Thread t3 = new Thread(mobj3); // 15

        t1.start(); // Runnable Thread ( JVM schedular internally calls the run method)
        t2.start();
        t3.start();

    }
}