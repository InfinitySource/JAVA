package multithreading.multithreadtest;

public class MyThread extends Thread {

    String msg = "Thread running...";

    MyThread(){}
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {

        for(int i = 1; i <= 5 ; i++){
            System.out.println(Thread.currentThread().getName() + " is running....");
            Thread.yield();
        }


        // System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority()  );

        try{
            sleep(1000);
            System.out.println("Thread " + currentThread().getName()+ " is running.....");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: "+ e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread l = new MyThread("Low Priority Thread");
        MyThread m = new MyThread("Medium Priority Thread");
        MyThread h = new MyThread("High Priority Thread");

//        l.start();
//        l.join();
//        m.start();
//        h.start();

//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        h.setPriority(Thread.MAX_PRIORITY);

//        l.start();
//        m.start();
//        h.start();


        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");

        t1.start();
        t2.start();
//        t1.interrupt();

    }
}


// method - start, run, sleep, join, interrupt, yield