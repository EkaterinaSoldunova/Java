import java.util.Calendar;
import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        Date data = new Date(1212121212121L);
        Student s = new Student("Маша","Иванова","программная инженерия", 3,45,4,data);
        System.out.println(s.toString(1));
        System.out.println(s.toString(2));
        System.out.println(s.toString(3));
    }
}
