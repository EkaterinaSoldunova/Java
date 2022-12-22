public class Task3<T extends String, V extends Animal, K extends Number> {
    private T a;
    private V b;
    private K c;

    public Task3(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public V getB() {
        return b;
    }

    public K getC() {
        return c;
    }

    public String toString() {
        return a + " (" + a.getClass() + "), "+ b + " ("+b.getClass()+"), "+c+" ("+c.getClass()+")";
    }

    public static void main(String[] args) {
        Task3<String, Cat,Integer> generic = new Task3<>("qwerty", new Cat(), 1);
        System.out.println(generic);
    }
}