package multithreading.synchronization;

class User implements Runnable{

    private final Site site;

    User(Site site){
        this.site = site;
    }

    @Override
    public void run() {
        site.doReservation();
    }
}
