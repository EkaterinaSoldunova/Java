import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class FindFiles {
    ArrayList <File> list;
    public FindFiles (String Path) throws IOException{

        list = new ArrayList<File>();
        File f = new File(Path);
        File[] listFiles = f.listFiles();
        int i=0;
        for(File f1 :listFiles){
            list.add(f1);
        }
    }

    public void WriteToFileList(String path) throws IOException{
        byte [] bt;
        try (FileOutputStream inFile = new FileOutputStream(path)){

            for(File f: list){
                bt = (f.getCanonicalPath() + System.getProperty("line.separator")).getBytes();
                inFile.write(bt);
            }
        }
    }

    public void ReadFile (String path, int cont) throws IOException{

        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if(i ==(cont-1)) {
                    return;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String pathDir = "C:\\Users\\User\\IdeaProjects\\new_prakt_21\\dir";
        String pathFile = "C:\\Users\\User\\IdeaProjects\\new_prakt_21\\file.txt";

        FindFiles f = new FindFiles(pathDir);
        f.WriteToFileList(pathFile);
        f.ReadFile(pathFile, 5);
    }

}