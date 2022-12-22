package Author;

import Author.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Kate", "kate@mail.ru", 'F');
        Author a2 = new Author("Lelya", "lelya@mail.ru", 'F');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
        a2.setEmail("olga@mail.ru");
        System.out.println(a2);
    }
}