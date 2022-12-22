import java.util.TreeSet;

public class TestComparable{
    public static void main(String[] args) {
        TreeSet<Students> studentsArray = new TreeSet<Students>();
        Students s1 = new Students(123, "Kate", 5);
        Students s2 = new Students(831, "Mary", 3);
        Students s3 = new Students(103,"Roby", 4);

        studentsArray.add(s1);
        studentsArray.add(s2);
        studentsArray.add(s3);

        for (Students s: studentsArray) {
            System.out.println(s);
        }
    }
}
