import java.io.*;

public class Task6 {
    public static StringBuilder getLine(String str){
        StringBuilder sb = new StringBuilder();
        String[] w = str.split(" ");
        sb.append(w[0]);
        for (int j = 0; j < w.length; j++) {

            for (int i = 1; i < w.length; i++) {
                if(w[i].length()==0)continue;
                if(sb.toString().toLowerCase().charAt(0) == w[i].toLowerCase().charAt(w[i].length()-1)){
                    sb.insert(0, w[i] + " ");
                    w[i] = "";
                }
                else if(sb.toString().toLowerCase().charAt(sb.length()-1) == w[i].toLowerCase().charAt(0)){
                    sb.append(" " + w[i]);
                    w[i] = "";
                }
            }

        }
        return sb;
    }
    public static void main(String arg[]) throws IOException {
        Reader reader = new FileReader("src/file.txt");
        BufferedReader buffReader = new BufferedReader(reader);
        String str="";
        while (buffReader.ready()) {
            str+=buffReader.readLine();
        }
        System.out.println(getLine(str).toString());
        reader.close();
        buffReader.close();
    }
}
