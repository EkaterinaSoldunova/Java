import java.util.Comparator;

public class SortingStudentsByGPA{
    Student[] iDNumber;
    public void setArray(Student[] s, int n){
        iDNumber = new Student[n];
        for(int i=0;i<s.length;i++){
            iDNumber[i]=s[i];
        }
    }
    public void outArray(){
        for(Student s : iDNumber){
            System.out.println(s);
        }
    }
    public void quickSort(int leftBorder, int rightBorder, Comparator c){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = iDNumber[(leftMarker + rightMarker) / 2];
        do {
            while (c.compare(iDNumber[leftMarker],pivot)==1) { //<
                leftMarker++;
            }
            while (c.compare(iDNumber[rightMarker],pivot)==-1) { //>
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = iDNumber[leftMarker];
                    iDNumber[leftMarker] = iDNumber[rightMarker];
                    iDNumber[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(leftMarker, rightBorder,c);
        }
        if (leftBorder < rightMarker) {
            quickSort(leftBorder, rightMarker,c);
        }
    }
    public void MergeSort(int s,int e,Student tmp[], Comparator c) {
        if(s < e) {
            int m = s + (e-s) / 2;
            MergeSort(s,m,tmp, c);
            MergeSort(m+1,e,tmp, c);
            Merge(s,m,e,tmp,c);
        }
    }
    public void Merge(int s,int m,int e,Student tmp[],Comparator c) {
        int pb = 0;
        int p1 = s;
        int p2 = m + 1;
        while(p1 <= m && p2 <= e) {
            if(c.compare(iDNumber[p1],iDNumber[p2])==-1)
                tmp[pb++] = iDNumber[p1++];
            else
                tmp[pb++] = iDNumber[p2++];
        }
        while(p1<=m)
            tmp[pb++] = iDNumber[p1++];
        while(p2<=e)
            tmp[pb++] = iDNumber[p2++];
        for (int i = 0; i < e-s+1; i++)
            iDNumber[s+i]=tmp[i];
    }

    public static void main(String[] args) {

        Student[] studentsArray1 = new Student[3];
        Student s1 = new Student("Маша","Иванова","программная инженерия", 3,45,4);
        Student s2 = new Student("Ваня","Сидоров","прикладная информатика", 1,10,5);
        Student s3 = new Student("Петя","Петров","экономика", 2,20,3);
        studentsArray1[0]=s1;
        studentsArray1[1]=s2;
        studentsArray1[2]=s3;

        SortingStudentsByGPA o1 = new SortingStudentsByGPA();
        o1.setArray(studentsArray1,3);

        System.out.println("Первый неотсортированный список:");
        o1.outArray();

        System.out.println("\n");

        System.out.println("Быстрая сортировка первого списка по итоговым оценкам в порядке убывания:");
        o1.quickSort(0,2,new MarkComparator());
        o1.outArray();

        System.out.println("\n");

        Student[] studentsArray2 = new Student[3];
        Student s4 = new Student("Леша","Новиков","программная инженерия", 4,45,4);
        Student s5 = new Student("Кирилл","Киров","прикладная информатика", 5,10,5);
        Student s6 = new Student("Лена","Орлова","психология", 3,20,3);
        studentsArray2[0]=s4;
        studentsArray2[1]=s5;
        studentsArray2[2]=s6;

        SortingStudentsByGPA o2 = new SortingStudentsByGPA();
        o2.setArray(studentsArray2,3);

        System.out.println("Второй неотсортированный список:");
        o2.outArray();

        System.out.println("\n");

        Student[] studentsArray3 = new Student[studentsArray1.length+studentsArray2.length];
        for (int i=0;i<studentsArray1.length;i++) {
            studentsArray3[i]=studentsArray1[i];
        }
        for (int i=0;i<studentsArray2.length;i++) {
            studentsArray3[i+studentsArray1.length]=studentsArray2[i];
        }
        Student[] studentsArray4 = new Student[studentsArray1.length+studentsArray2.length];

        SortingStudentsByGPA o3 = new SortingStudentsByGPA();
        o3.setArray(studentsArray3,6);
        o3.MergeSort(0,studentsArray3.length-1,studentsArray4, new CourseComparator());

        System.out.println("Объединенный упорядоченный сортировкой слиянием список по курсу:");
        o3.outArray();
    }
}