import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.course == s2.course) {
            return 0;
        }
        if (s1.course > s2.course) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
