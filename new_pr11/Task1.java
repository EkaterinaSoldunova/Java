import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        String name="Солдунова Екатерина";

        Date now = new Date();

        Date getDateOfFinishTask = new Date();
        Long time = getDateOfFinishTask.getTime();
        long anotherDate = 7;
        time = time + (60 * 60 * 24 * 1000 * anotherDate);
        getDateOfFinishTask = new Date(time);

        System.out.println("Разработчик: "+name);
        System.out.println("Дата получения задания: "+now);
        System.out.println("Дата сдачи задания: "+getDateOfFinishTask);
    }
}
