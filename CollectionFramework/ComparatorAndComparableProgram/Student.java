package CollectionFramework.ComparatorAndComparableProgram;

public class Student {


    private int id;
    private String name;
    private String city;
    private double persentage;


    public Student(int id, String name, String city, double persentage) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.persentage = persentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", persentage=" + persentage +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPersentage() {
        return persentage;
    }

    public void setPersentage(double persentage) {
        this.persentage = persentage;
    }
}
