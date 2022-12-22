package Book;
public class Book {
    private String name;
    private String author;
    private int year;
    public Book(String n, String a, int y){
        name = n;
        author = a;
        year = y;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear() {
        return year;
    }
    public String toString(){
        return name+", "+author+", "+year;
    }
    public void defineAgeOfBook(){
        System.out.println("Book with the name '"+name+"' "+ (2022-year)+ " years");
    }
}
