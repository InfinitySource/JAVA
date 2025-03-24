package multithreading.methodofthreadclass;

public class StartMethodInThreadClass {

    public static void main(String[] args)  {

        Reading r = new Reading();
        Writing w = new Writing();
        Listening l = new Listening();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(l);

        t1.start();
        try{
            t2.join(100);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();




        // start(), run(), sleep(), join(), currentThread(),
    }

}

class Reading implements Runnable{

    public void bookReading(){
        for(int i=1; i<= 10;i++){
            System.out.println("Book Reading processing");
        }

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void run(){
        bookReading();
    }
}


class Writing implements Runnable{

    public void bookWriting(){

        for(int i=1; i<= 10;i++){
            System.out.println("Book Writing processing");
        }
    }
    public void run(){
        bookWriting();
    }
}

class Listening implements Runnable{

    public void listeningMusic(){

        for(int i=1; i<= 10;i++){
            System.out.println("listening music processing");
        }
    }
    public void run(){
        listeningMusic();
    }
}
