package oop.exceptionhandling.throwable.exception;

public class CloneNotSupportException {

    public static void main(String[] args) {

        TeamPlayer t1 = new TeamPlayer("Piyush");
        System.out.println(t1);

//        try{
//
//            TeamPlayer t2 = (TeamPlayer)t1.clone();
//            System.out.println(t2);
//
//        } catch (CloneNotSupportException e) {
//            System.out.println(e);
//        }


    }

}

class TeamPlayer {

    private String name;

    public TeamPlayer(String name)
    {
        super();
        this.name = name;
    }

    @Override public String toString()
    {
        return "TeamPlayer[Name= " + name + "]";
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}

