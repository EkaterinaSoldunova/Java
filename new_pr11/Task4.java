import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Год: ");
        int year = sc.nextInt();
        System.out.println("Месяц: ");
        int month = sc.nextInt();
        System.out.println("День: ");
        int day = sc.nextInt();
        System.out.println("Часы: ");
        int hour = sc.nextInt();
        System.out.println("Минуты: ");
        int min = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year,month-1,day,hour,min,0);
        System.out.println(c.getTime());

        Date d = c.getTime();
        System.out.println(d);
    }
}
