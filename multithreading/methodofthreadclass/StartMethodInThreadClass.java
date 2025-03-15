package multithreading.methodofthreadclass;

public class StartMethodInThreadClass {

    public static void main(String[] args) {

        Reading r = new Reading();
        Writing w = new Writing();

        r.start();
        w.start();

    }

}

class Reading extends Thread{
    public void bookReading(){
        for(int i=1; i<= 10;i++){
            System.out.println("Book Reading processing");
        }
    }
    public void run(){
        bookReading();
    }
}class Writing extends Thread{
    public void bookWriting(){
        for(int i=1; i<= 10;i++){
            System.out.println("Book Writing processing");
        }
    }
    public void run(){
        bookWriting();
    }
}
