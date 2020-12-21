
import java.lang.*;

class Marvellous extends Thread {
    public void Display() {

        for (int i = 0; i <= 500; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);

        }
    }

    public void run() {
        Display();
    }
}

class Demo2 {
    public static void main(String arg[]) {
        Marvellous mobj = new Marvellous();

        Thread t1 = new Thread(mobj, "First"); // New state
        Thread t2 = new Thread(mobj, "Second");

        t1.start(); // Thread in runnable state-> Thread Schedular schedules thread and Internally
                    // calls the run method
        try {
            t1.join();    //it will wait till the execution of t1 gets finished
        } catch (Exception ref) {

        }

        t2.start();

        // thread goes to dead state after the execution gets completed

    }
}