import java.util.Arrays;

class Array<T> {
    private Object[] arr;
    public int length;
    public Array(int length) {
        arr = new Object[length];
        this.length = length;
    }

    T get(int i) {
        T t = (T)arr[i];
        return t;
    }
    void set(int i, T t) {
        arr[i] = t;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int length = 3;
        Array<Integer> intArray = new Array(length);
        intArray.set(0,4);
        intArray.set(1,19);
        intArray.set(2,7);
        System.out.println(intArray);
        System.out.println("Индекс 2: "+intArray.get(1));

        System.out.println();

        Array<String> strArray = new Array(length);
        strArray.set(0,"f");
        strArray.set(1,"r");
        strArray.set(2,"y");
        System.out.println(strArray);
        System.out.println("Индекс 2: "+strArray.get(1));

    }
}