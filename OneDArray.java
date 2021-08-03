import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {

        String[] students = new String[5];
        students[0] = "Famche";
        students[1] = "Cheme";
        students[2] = "FaMa";
       // students[3] = "Shache";
        System.out.println("The second student is: " + students[1]);
        System.out.println("The length of the array is:::" + students.length);

        for (int i=0;i<students.length;i++){
            System.out.println("Student at: " + i + " is---->" + students[i]);
        }
        students[2] = null;
        System.out.println("The second item on update is:: " + students[2]);

      /*
        Student[] students = new Student[5];
        students[1] = new Student(1,"Famche");
        students[2] = new Student(2,"Kip");
        students[3] = new Student(3,"Shabo");
        System.out.println("The lenght of students arrays are: " + students.length);

      *//*  for (Student student : students){
            System.out.println("The students are: " + student);
        }*//*
        for (int i = 0 ; i<students.length; i++){
            System.out.println("The student at index: " + i + " is: " + students[i]);
        }*/
    }


}
