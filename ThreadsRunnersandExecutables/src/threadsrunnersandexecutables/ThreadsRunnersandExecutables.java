/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsrunnersandexecutables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Eddie Pincay
 */

class startThread extends Thread {
    public void run() {
        System.out.println("step 1 - Thread");
    }
}

class startRunnable implements Runnable {
    public void run() {
        System.out.println("step 2 - Runnable");
    }
}

public class ThreadsRunnersandExecutables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("step 0 - starting");
        
        startThread first1 = new startThread();
        first1.start();
        
        Thread second2 = new Thread(new startRunnable());
        second2.start();
        
        
        
        try {
            Thread.sleep(2000);
            System.out.println("step 3 - after 2 seconds sleep");
        } catch (InterruptedException e) {
            System.out.println("Exception works " + e);
        }
           

        ExecutorService exe = Executors.newSingleThreadExecutor();
        exe.submit(() -> {
        String threadName = Thread.currentThread().getName();
        System.out.println("step 4 - Name of the pool and thread: " + threadName);
        });


        try {
            System.out.println("step 5 - try to shutdown exe");
            exe.shutdown();
            exe.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("Can't shutdown");
        }
        finally {
            if (!exe.isTerminated()) {
                System.err.println("Try again");
            }
            exe.shutdownNow();
            System.out.println("step 6 - Sucessfuly shutdown exe");
        }
        
        
    }
    
}
