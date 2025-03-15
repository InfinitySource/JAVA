package multithreading.multithreadingexample;

public class Writing extends Thread {
    public void bookwriting(){

        for (int i= 1; i <= 10; i++){
            System.out.println("Book Writing processing");
        }

    }

    public void run(){
        bookwriting();
    }
}
