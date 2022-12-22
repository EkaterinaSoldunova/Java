public class Student implements Comparable<Student>{
    String name;
    int mark, groupNum;
    public static final MarkComparator MARK_COMP = new MarkComparator();
    public static final GroupComparator GROUP_COMP = new GroupComparator();

    public Student(String fio, int mark, int groupNum) {
        this.name = fio;
        this.mark = mark;
        this.groupNum = groupNum;
    }

    public String getFio() {
        return name;
    }
    public int getMark() {
        return mark;
    }
    public int getGroupNum() {
        return groupNum;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", средний балл = " + mark + ", номер группы = " + groupNum;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}