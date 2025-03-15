package multithreading.multithreadingexample;

public class Listening extends  Thread{

    public void musiclistening(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Music Listening");
        }
    }

    public void run(){
        musiclistening();
    }

}
