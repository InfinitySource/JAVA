package multithreading.methodofthreadclass.currentthread;

class MainClass {

    public static void main(String[] args) {

        Site s = new Site();


        Thread t = Thread.currentThread();

        ThreadGroup tg1 = new ThreadGroup("GroupA");
        ThreadGroup tg2 = new ThreadGroup("GroupB");


        User u1 = new User(s);
        User u2 = new User(s);
        User u3 = new User(s);
        User u4 = new User(s);

        


        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        Thread t3 = new Thread(u3);
        Thread t4 = new Thread(u4);

        // group
//        Thread t1 = new Thread(tg1.getParent().getParent(),u1);
//        Thread t2 = new Thread(tg1,u2);
//        Thread t3 = new Thread(tg2.getParent(),u3);
//        Thread t4 = new Thread(tg2,u4);


//        System.out.println(t1.getId());
//        System.out.println(t2.getId());
//
//
//        System.out.println(t1.getName());
//        System.out.println(t2.getName());
//
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");


//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);




//        System.out.println(t1.isAlive());
//        t1.start();
//        try{
//            t1.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        t2.start();

//        t3.setDaemon(true);
//        t3.start();
//        t3.start();
//        t3.isDaemon();
//        t4.start();
//        System.out.println(t1.isAlive());

        t1.start();



        t2.start();
        t3.start();
        t4.start();




    }

}
