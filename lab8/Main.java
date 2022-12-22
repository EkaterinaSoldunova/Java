import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileWriter file = new FileWriter("file.txt", false))
        {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            file.write(str);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}