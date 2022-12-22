import java.util.Calendar;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текущую дату");
        System.out.println("Год: ");
        int year = sc.nextInt();
        System.out.println("Месяц: ");
        int month = sc.nextInt();
        System.out.println("День: ");
        int day = sc.nextInt();

        if (year==now.get(Calendar.YEAR) && day==now.get(Calendar.DAY_OF_MONTH)&& (month==now.get(Calendar.MONTH)+1)) {
            System.out.println("Дата верная");
        }
        else System.out.println("Дата неверная");
    }
}
