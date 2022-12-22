import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
    String name;
    String surname;
    String speciality;
    int course;
    int group;
    int mark;
    Date data;
    public Student(String name, String surname, String speciality, int course, int group, int mark, Date data){
        this.name=name;
        this.surname=surname;
        this.speciality=speciality;
        this.course=course;
        this.group=group;
        this.mark=mark;
        this.data=data;
    }
    public String dataString(int format){
        SimpleDateFormat dateFormatter;
        if (format==1){
            dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        }
        else if (format==2){
            dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        }
        else {
            dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        }
        return dateFormatter.format(data);
    }
    public String toString(int format) {
        String dataStr=dataString(format);
        return surname+" "+name+", "+speciality+", "+course+" курс, "+group+" группа, итоговая оценка: "+mark+", дата рождения: "+dataStr;
    }
}
