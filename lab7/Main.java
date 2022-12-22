import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        //создание списка
        LinkedList<String> colors = new LinkedList<String>();
        //добавление элементов
        colors.add("green");
        colors.add("blue");
        colors.add("orange");
        colors.addLast("red");
        colors.addFirst("black");
        colors.add(1, "yellow");
        //вывод списка
        System.out.println("Исходный список:");
        for(String color : colors){
            System.out.println("   "+color);
        }
        //тестирование методов
        System.out.println("Количество элементов в списке: "+colors.size());
        System.out.println("Пятый элемент: "+colors.get(4));
        colors.set(2, "pink");
        System.out.println("Список после смены третьего элемента: ");
        for(String color : colors){
            System.out.println("   "+color);
        }
        if(colors.contains("black")){
            System.out.println("Список содержит black");
        }
        else {
            System.out.println("Список не содержит black");
        }
        //удаление элементов
        colors.remove("blue");
        colors.removeFirst();
        colors.removeLast();
        System.out.println("Список после удаления элементов: ");
        for(String color : colors){
            System.out.println("   "+color);
        }
    }
}
