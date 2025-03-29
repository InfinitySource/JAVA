package CollectionFramework.Map;

import CollectionFramework.ComparatorAndComparableProgram.Student;
import CollectionFramework.ComparatorAndComparableProgram.StudentByIdASC;
import com.mysql.cj.util.StringInspector;

import java.util.*;

public class TreeMapStudentDetailsExample {

    public static void main(String[] args) {

        Map<Student,Map<String, List<String>>>  students = new TreeMap<>(new StudentByIdASC());


        Student s1 = new Student(12, "vivek", "Sangli", 83.32 );

        Map<String, List<String>> detailsOfS1 = new HashMap<>();

        List<String> listOfImagesOfS1 = new ArrayList<>();
        listOfImagesOfS1.add("Img01.jpg");
        listOfImagesOfS1.add("Img02.jpg");
        listOfImagesOfS1.add("Img03.jpg");
        listOfImagesOfS1.add("Img04.jpg");
        listOfImagesOfS1.add("Img05.jpg");
        detailsOfS1.put("listOfImages" , listOfImagesOfS1);


        List<String> listOfCertificationsOfS1 = new ArrayList<>();
        listOfCertificationsOfS1.add("Python Programming (Coursera)");
        listOfCertificationsOfS1.add("Data Science (edX)");
        detailsOfS1.put("listOfCertifications" , listOfCertificationsOfS1);



        List<String> listOfAchivementsOfS1 = new ArrayList<>();
        listOfAchivementsOfS1.add("Dean's List (2022), Hackathon Winner");
        listOfAchivementsOfS1.add("Internship at TechCorp, Published Paper");
        detailsOfS1.put("listOfAchivements" , listOfAchivementsOfS1);



        List<String> listOfReviewsOfS1  = new ArrayList<>();
        listOfReviewsOfS1.add("Alice is a dedicated student with great skills!" );
        listOfReviewsOfS1.add("Bob's analytical skills are impressive." );
        listOfReviewsOfS1.add("Charlie has a knack for teaching others." );
        detailsOfS1.put("listOfReviews" , listOfReviewsOfS1);





        Student s2 = new Student(3, "Rahul", "Nagpur", 97.32 );

        Map<String, List<String>> detailsOfS2 = new HashMap<>();

        List<String> listOfImagesOfS2 = new ArrayList<>();
        listOfImagesOfS2.add("Img04.jpg");
        listOfImagesOfS2.add("Img05.jpg");
        listOfImagesOfS2.add("Img06.jpg");
        detailsOfS2.put("listOfImages" , listOfImagesOfS2);


        List<String> listOfCertificationsOfS2 = new ArrayList<>();
        listOfCertificationsOfS2.add("Graphic Design (Skillshare)");
        listOfCertificationsOfS2.add("Cybersecurity (Cybrary)");
        detailsOfS2.put("listOfCertifications" , listOfCertificationsOfS2);



        List<String> listOfAchivementsOfS2 = new ArrayList<>();
        listOfAchivementsOfS2.add("Art Exhibition Participant, Scholarship");
        listOfAchivementsOfS2.add("Cybersecurity Challenge Winner");
        detailsOfS2.put("listOfAchivements", listOfAchivementsOfS2);


        List<String> listOfReviewsOfS2  = new ArrayList<>();
        listOfReviewsOfS2.add("Diana's creativity shines through her work." );
        listOfReviewsOfS2.add("Edward is a problem solver and a team player." );
        detailsOfS2.put("listOfReviews" , listOfReviewsOfS2);






        Student s3 = new Student(5, "Suraj", "Kanpur", 92.32 );

        Map<String, List<String>> detailsOfS3 = new HashMap<>();

        List<String> listOfImagesOfS3 = new ArrayList<>();
        listOfImagesOfS3.add("Img07.jpg");
        listOfImagesOfS3.add("Img08.jpg");
        detailsOfS3.put("listOfImages" , listOfImagesOfS3);


        List<String> listOfCertificationsOfS3 = new ArrayList<>();
        listOfCertificationsOfS3.add("Machine Learning (Coursera)");
        listOfCertificationsOfS3.add("Mobile App Development (Udacity)");
        detailsOfS3.put("listOfCertifications" , listOfCertificationsOfS3);



        List<String> listOfAchivementsOfS3 = new ArrayList<>();
        listOfAchivementsOfS3.add("Research Assistant, AI Conference Speaker");
        listOfAchivementsOfS3.add("App Store Feature, Startup Founder");
        listOfAchivementsOfS3.add("Cloud Innovation Award, Tech Conference Speaker");
        detailsOfS3.put("listOfAchivements", listOfAchivementsOfS3);


        List<String> listOfReviewsOfS3  = new ArrayList<>();
        listOfReviewsOfS3.add("Hannah's insights into AI are remarkable." );
        listOfReviewsOfS3.add("Ian's entrepreneurial spirit is inspiring." );
        listOfReviewsOfS3.add("Julia's expertise in cloud tech is top-notch." );
        detailsOfS3.put("listOfReviews" , listOfReviewsOfS3);



        students.put(s1, detailsOfS1);
        students.put(s2, detailsOfS2);
        students.put(s3, detailsOfS3);



        Set<Student> set = students.keySet();

//        System.out.println(set);

        for(Student s : set){

            System.out.println("Name of Student : " + s.getName());

            Map<String, List<String>> details = students.get(s);

            System.out.println("List Of Images: ");
            for(Object o : details.get("listOfImages")){

                System.out.println(o);
            }
            System.out.println("----------------------------------------------------------------------------");

            System.out.println("List Of Certificates: ");
            for(Object o: details.get("listOfCertifications")){

                System.out.println(o);
            }

            System.out.println("----------------------------------------------------------------------------");


            System.out.println("List Of Achivements: ");
            for(Object o: details.get("listOfAchivements")){

                System.out.println(o);
            }

            System.out.println("----------------------------------------------------------------------------");


            System.out.println("List Of Reviews: ");
            for(Object o: details.get("listOfReviews")){

                System.out.println(o);
            }

            System.out.println("----------------------------------------------------------------------------");


        }











    }


}
