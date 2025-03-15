package multithreading.multithreadingexample;

public class MainClass {

    public static void main(String[] args) {

        Reading r = new Reading();
        Listening l = new Listening();
        Writing w = new Writing();

       r.start();
       l.start();
       w.start();

    }

}
