public class ShellTask1 {
    public static void main(String[] args) {
        /*
1. Создайте объекты класса Double, используя методы valueOf().
2. Преобразовать значение типа String к типу double. Используем
метод Double.parseDouble().
3. Преобразовать объект класса Double ко всем примитивным типам.
4. Вывести значение объекта Double на консоль.
5. Преобразовать литерал типа double к строке: String d =
Double.toString(3.14);
*/
        //1
        Double d1 = Double.valueOf(5);
        Double d2 = Double.valueOf(4.6);
        //2
        String s = "6.789";
        Double d3 = Double.parseDouble(s);
        //3
        byte p1 = d2.byteValue();
        short p2 = d2.shortValue();
        int p3 = d2.intValue();
        long p4 = d2.longValue();
        float p5 = d2.floatValue();
        //4
        System.out.println(d2);
        //5
        String d = Double.toString(3.14);
    }
}
