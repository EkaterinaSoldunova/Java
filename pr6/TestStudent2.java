import java.util.ArrayList;

public class TestStudent2 {
    public static void main(String[] args) {
        Students[] studentsArray = new Students[3];
        Students s1 = new Students(123,"Kate", 5);
        Students s2 = new Students(532,"Mary", 3);
        Students s3 = new Students(812,"Roby", 4);

        studentsArray[0]=s1;
        studentsArray[1]=s2;
        studentsArray[2]=s3;

        for (Students s: studentsArray) {
            System.out.println(s);
        }

        SortingStudentsByGPA arraySorting = new SortingStudentsByGPA();
        arraySorting.quickSort(studentsArray, 0, 2);

        System.out.println("Sorted: ");
        for (Students s: studentsArray) {
            System.out.println(s);
        }
    }
}
