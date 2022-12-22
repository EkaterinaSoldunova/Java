public class Task12<T,V,K> {
    private T a;
    private V b;
    private K c;

    public Task12(T a, V b, K c) {
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
        Task12<Integer,Double,String> generic = new Task12<>(1,1.2,"qwerty");
        System.out.println(generic);
    }
}
