import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.mark == s2.mark) {
            return 0;
        }
        if (s1.mark > s2.mark) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
