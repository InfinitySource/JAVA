package oop.encapsulation.studentinfo;

public class MainClass {
    public static void main(String[] args) {

        Students s1 = new Students();

        s1.setId(10);
        s1.setCity("kanpur");
        s1.setName("Raju");
        s1.setPercentage(79.87);

        System.out.println("ID : " + s1.getId());
        System.out.println("Name : " + s1.getName());
        System.out.println("City : " + s1.getCity());
        System.out.println("Percentage : " + s1.getPercentage());



        Students s2 = new Students(1, "Karan", "Delhi", 89.43);

        System.out.println(s2);


    }
}
