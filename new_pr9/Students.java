public class Students implements Comparable<Students>{
    String name;
    int mark;
    int id;
    public Students(int id, String name, int mark){
        this.name=name;
        this.mark=mark;
        this.id=id;
    }
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("ID=").append(id);
        sb.append(", name=").append(name);
        sb.append(", mark=").append(mark);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public int compareTo(Students s){
        if (this.mark == s.mark) {
            return 0;
        }
        if (this.mark > s.mark) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
