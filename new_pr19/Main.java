import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Екатерина", 5, 1));
        s.add(new Student("Максим", 4, 6));
        s.add(new Student("Вячеслав", 3, 13));
        s.add(new Student("Анастасия", 5, 3));
        s.add(new Student("Сергей", 4, 2));

        new GUI(s);
    }

}