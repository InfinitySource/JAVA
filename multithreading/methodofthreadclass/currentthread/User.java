package multithreading.methodofthreadclass.currentthread;

class User implements Runnable {

    private Site site;

    User(){};
    User(Site site){
        this.site = site;
    }



    @Override
    public void run() {
        Site.doReservation();
    }
}
