package multithreading.methodofthreadclass.currentthread;

class Site {

    public static void doReservation(){

        Thread t = Thread.currentThread();

        for(int i= 1; i <= 3; i++){
            System.out.println( t + " \t reservation in processing");
        }
    }

}
