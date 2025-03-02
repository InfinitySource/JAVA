package jdbclearn;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Jdbc {

    private static  final String url = "jdbc:mysql://localhost:3306/mydb";
    private static  final String username = "root";
    private static  final String password = "Gitesh@123";



    public static void main(String[] args) {


        try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }



        try{

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            String query = "select * from students";
//            String query = String.format("INSERT INTO students(name, age, marks) values('%s', %o, %f)" , "KARAN", 20, 89.5);

//            String query = String.format("update students set age = %o where id = %d", 22, 3);


            // CRUD - create , read , delete, update.

            // executeQuery - read.
            ResultSet resultSet = statement.executeQuery(query);

            // executeUpdate - insert, delete , update.
//            int rowsAffected = statement.executeUpdate(query);



            // for reading data in database
            while(resultSet.next()){

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("ID : " + id);
                System.out.println("NAME : " + name);
                System.out.println("AGE : " + age);
                System.out.println("MARKS : " + marks);
                System.out.println("========================");

            }



            // to insert data into database
//            if(rowsAffected > 0){
//                System.out.println("Data inserted successfully");
//            }else {
//                System.out.println("Data not inserted");
//            }



            // To update data in database
//            if(rowsAffected > 0){
//                System.out.println("Data updated successfully");
//            }else {
//                System.out.println("Data not updated successfully");
//            }



        }
        catch (SQLException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }


}
