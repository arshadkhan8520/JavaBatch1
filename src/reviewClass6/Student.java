package src.reviewClass6;

public class Student {

   /* create a class students
Create three   variables studentName , studentID  and numberOfStudents
 Create three objects of the Students Class Set the value for  studentName , studentID and increment
  the numberOfStudents for each object Print out  total number of students*/

    String studentName;
    int studentID;
    static int numberOfStudent;

    public static void main(String[] args) {

        Student st = new Student();
        st.studentID=123;
        st.studentName="Muhibullah";
        numberOfStudent++;

        Student st1 = new Student();
        st1.studentID=1234;
        st1.studentName="Arshad";
        numberOfStudent++;

        Student st2 = new Student();
        st2.studentName="Aziz";
        st2.studentID=12345;
        numberOfStudent++;
        System.out.println(numberOfStudent);


    }
}
