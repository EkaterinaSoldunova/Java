import java.util.Arrays;

public class MinMax<T extends Comparable<T>> implements Comparable<MinMax<T>> {
    private final T[] arr;
    private T data;
    public final int length;

    public MinMax(Class<T> type, int length) {
        // Создает новый массив указанного типа и длины во время выполнения
        this.arr = (T[]) java.lang.reflect.Array.newInstance(type, length);
        this.length = length;
    }

    public T get(int i) {
        return arr[i];
    }

    public void set(int i, T e) {

        arr[i] = e;
    }
    @Override
    public String toString() {

        return Arrays.toString(arr);
    }


    @Override
    public int compareTo(MinMax<T> another) {

        return data.compareTo(another.data);
    }


    public T maxElem() {
        T max = arr[0];
        for (int i = 1; i<length; i++) {
            data = arr[i];
            if (data.compareTo(max) > 0) max = arr[i];
        }
        return max;
    }

    public T minElem() {
        T min = arr[0];
        for (int i = 1; i<length; i++) {
            data = arr[i];
            if (data.compareTo(min) < 0) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        final int length = 3;
        MinMax<Integer> intArray = new MinMax(Integer.class, length);
        intArray.set(0,8);
        intArray.set(1,3);
        intArray.set(2,14);
        System.out.println(intArray);

        System.out.println("Максимальный элемент массива: "+intArray.maxElem());
        System.out.println("Минимальный элемент массива: "+intArray.minElem());

        System.out.println();

        MinMax<String> strArray = new MinMax(String.class, length);
        strArray.set(0,"a");
        strArray.set(1,"y");
        strArray.set(2,"z");
        System.out.println(strArray);

        System.out.println("Максимальный элемент массива: "+strArray.maxElem());
        System.out.println("Минимальный элемент массива: "+strArray.minElem());
    }
}
