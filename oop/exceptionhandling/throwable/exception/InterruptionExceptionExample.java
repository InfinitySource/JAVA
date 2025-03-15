package oop.exceptionhandling.throwable.exception;

public class InterruptionExceptionExample {


        public static void main(String[] args) {
            Thread workerThread = new Thread(() -> {
                try {
                    System.out.println("Worker thread started.");
                    Thread.sleep(5000); // Simulate a long-running task
                    System.out.println("Worker thread finished.");
                } catch (InterruptedException e) {
                    System.out.println("Worker thread interrupted!");
                    // Optionally, reset the interrupt status if you intend to continue:
                    Thread.currentThread().interrupt(); // Re-interrupt, in case higher-level code needs to know.
                }
            });

            workerThread.start();

            // Interrupt the worker thread after 2 seconds
            try {
                Thread.sleep(2000);
                System.out.println("Interrupting worker thread...");
                workerThread.interrupt();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }

            try {
                workerThread.join(); //wait for the thread to finish.
            } catch (InterruptedException e){
                System.out.println("main thread join interrupted");
            }
            System.out.println("Main thread finished.");
        }


}
