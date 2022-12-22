package Book;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", "L.N.Tolstoy", 1867);
        Book b2 = new Book("Mtsyri", "M.Lermontov", 1838);
        System.out.println(b1);
        System.out.println(b2.getName());
        b1.defineAgeOfBook();
        b2.defineAgeOfBook();
    }
}