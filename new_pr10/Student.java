public class Student{
    String name;
    String surname;
    String speciality;
    int course;
    int group;
    int mark;
    public Student(String name, String surname, String speciality, int course, int group, int mark){
        this.name=name;
        this.surname=surname;
        this.speciality=speciality;
        this.course=course;
        this.group=group;
        this.mark=mark;
    }
    public String toString() {
        return surname+" "+name+", "+speciality+", "+course+" курс, "+group+" группа, итоговая оценка: "+mark;
    }
}
