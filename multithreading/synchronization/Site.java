package multithreading.synchronization;

public class Site {

//    private boolean booked = false;

    // for static method of doReservation
    private static int booked = 0;

    // type 1 -  method synchronization
//    public synchronized void doReservation() {
//        Thread t = Thread.currentThread();
//
//        if (!booked) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(t.getName() + "\t reservation processing");
//
//            }
//            booked = true;
//            System.out.println(t.getName() + " your ticket booked successfully");
//
//        } else {
//            System.out.println(t.getName() + " ticket not available");
//        }
//
//    }



    // type 2 - Block synchronization
//    public void doReservation() {
//        Thread t = Thread.currentThread();
//
//        synchronized (this){
//
//        if (!booked) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(t.getName() + "\t payment processing");
//
//            }
//            booked = true;
//            System.out.println(t.getName() + " your ticket booked successfully");
//
//        } else {
//            System.out.println(t.getName() + " ticket not available");
//        }
//
//        }
//    }


    // type 3 - Static synchronization
    public static void doReservation() {
        Thread t = Thread.currentThread();

            if (booked < 3) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(t.getName() + "\t payment processing");

                }
                booked++;
                System.out.println(t.getName() + " your ticket booked successfully");

            } else {
                System.out.println(t.getName() + " ticket not available");
            }


    }


}
