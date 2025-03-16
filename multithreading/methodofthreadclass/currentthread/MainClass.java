package multithreading.methodofthreadclass.currentthread;

class MainClass {

    public static void main(String[] args) {

        Site s = new Site();

        User u1 = new User(s);
        User u2 = new User(s);
        User u3 = new User(s);
        User u4 = new User(s);


        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);
        Thread t3 = new Thread(u3);
        Thread t4 = new Thread(u4);

        System.out.println(t1.getId());
        System.out.println(t2.getId());


        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setName("T1");
        t2.setName("T2");


        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);




        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
