package javaassignment;

public class Students {

    private String Id;
    private String name;
    private String email;
    private String password;
    private int age;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name == null){
            System.out.println("Name should not be empty");
        }else{
            this.name = name;
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    //    public Students(String name, int age, String email, String password){
//        super();
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.password = password;
//    }

//    public Students(){super();}

    

}
