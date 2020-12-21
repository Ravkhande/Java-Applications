
import java.lang.*;

class Marvellous implements Runnable {

    public void run() // Ruuning
    {
        try {
            System.out.println("Inside run method for thread with id: " + Thread.currentThread().getId());

            for (int i = 1; i <= 5; i++) {
                System.out.println("Inside thread: " + Thread.currentThread().getId() + " " + i);
                Thread.sleep(100); // waiting

            }
        } catch (Exception ref) {
            System.out.println("Exception occured in threading");
        }

    }

}

class Demo {
    public static void main(String arg[]) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Marvellous mobj1 = new Marvellous(); // New thread creation state
        Thread t1 = new Thread(mobj1);

        Marvellous mobj2 = new Marvellous();
        Thread t2 = new Thread(mobj2);

        Marvellous mobj3 = new Marvellous();
        Thread t3 = new Thread(mobj3);

        t1.start(); // Runnable Thread
        t2.start();
        t3.start();

    }
}