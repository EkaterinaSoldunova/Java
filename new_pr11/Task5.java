import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long start = System.currentTimeMillis();
        for (int i=0;i<100000;i++) {
            arrayList.add(i);
        }
        long finish = System.currentTimeMillis();
        long time1 = finish-start;

        start = System.currentTimeMillis();
        for (int i=0;i<100000;i++) {
            linkedList.add(i);
        }
        finish = System.currentTimeMillis();
        long time2 = finish-start;

        if(time1>time2){
            System.out.println("Операция добавления в ArrayList происходит быстрее, чем в LinkedList");
        }
        else if(time2>time1){
            System.out.println("Операция добавления в LinkedList происходит быстрее, чем в ArrayList");
        }
        else {
            System.out.println("Операция добавления в ArrayList и в LinkedList происходит с одинаковой продолжительностью");
        }

        start = System.currentTimeMillis();
        for (int i=0;i<100000;i++) {
            arrayList.remove(0);
        }
        finish = System.currentTimeMillis();
        time1 = finish-start;

        start = System.currentTimeMillis();
        for (int i=0;i<100000;i++) {
            linkedList.remove(0);
        }
        finish = System.currentTimeMillis();
        time2 = finish-start;

        if(time1>time2){
            System.out.println("Операция удаления в ArrayList происходит быстрее, чем в LinkedList");
        }
        else if(time2>time1){
            System.out.println("Операция удаления в LinkedList происходит быстрее, чем в ArrayList");
        }
        else {
            System.out.println("Операция удаления в ArrayList и в LinkedList происходит с одинаковой продолжительностью");
        }

        start = System.currentTimeMillis();
        for (int i=0;i<100000;i++) {
            arrayList.contains(i);
        }
        finish = System.currentTimeMillis();
        time1 = finish-start;

        start = System.currentTimeMillis();
        for (int i=0;i<100000;i++) {
            linkedList.contains(i);
        }
        finish = System.currentTimeMillis();
        time2 = finish-start;

        if(time1>time2){
            System.out.println("Поиск по ключу в ArrayList происходит быстрее, чем в LinkedList");
        }
        else if(time2>time1){
            System.out.println("Поиск по ключу в LinkedList происходит быстрее, чем в ArrayList");
        }
        else {
            System.out.println("Поиск по ключу в ArrayList и в LinkedList происходит с одинаковой продолжительностью");
        }
    }
}
