package multithreading.threadclassexample;

public class Listening implements Runnable{

    public void musicListening(){
        for(int i = 1; i<=10; i++){
            System.out.println("Music Listening processing");
        }
    }

    public void run(){
        musicListening();
    }

}
