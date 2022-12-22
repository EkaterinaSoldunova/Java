import java.util.Comparator;

public class TestStudent3 implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        if (s1.mark == s2.mark) {
            return 0;
        }
        if (s1.mark > s2.mark) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public void MergeSort(Students a[],int s,int e,Students tmp[]) {
        if(s < e) {
            int m = s + (e-s) / 2;
            MergeSort(a, s,m,tmp);
            MergeSort(a,m+1,e,tmp);
            Merge(a,s,m,e,tmp);
        }
    }
    public void Merge(Students a[], int s,int m,int e,Students tmp[]) {
        int pb = 0;
        int p1 = s;
        int p2 = m + 1;
        while(p1 <= m && p2 <= e) {
            if(compare(a[p1],a[p2])==-1)
                tmp[pb++] = a[p1++];
            else
                tmp[pb++] = a[p2++];
        }
        while(p1<=m)
            tmp[pb++] = a[p1++];
        while(p2<=e)
            tmp[pb++] = a[p2++];
        for (int i = 0; i < e-s+1; i++)
            a[s+i]=tmp[i];
    }
    public static void main(String[] args) {

        Students[] studentsArray1 = new Students[3];
        Students s1 = new Students(123,"Kate", 5);
        Students s2 = new Students(532,"Mary", 3);
        Students s3 = new Students(812,"Roby", 4);
        studentsArray1[0]=s1;
        studentsArray1[1]=s2;
        studentsArray1[2]=s3;
        System.out.println("Первый список:");
        for (Students s: studentsArray1) {
            System.out.println(s);
        }
        System.out.println("\n");
        Students[] studentsArray2 = new Students[3];
        Students s4 = new Students(920,"Rob", 4);
        Students s5 = new Students(172,"Tom", 5);
        Students s6 = new Students(289,"Sam", 2);
        studentsArray2[0]=s4;
        studentsArray2[1]=s5;
        studentsArray2[2]=s6;
        System.out.println("Второй список:");
        for (Students s: studentsArray2) {
            System.out.println(s);
        }
        System.out.println("\n");
        Students[] studentsArray3 = new Students[studentsArray1.length+studentsArray2.length];
        for (int i=0;i<studentsArray1.length;i++) {
            studentsArray3[i]=studentsArray1[i];
        }
        for (int i=0;i<studentsArray2.length;i++) {
            studentsArray3[i+studentsArray1.length]=studentsArray2[i];
        }
        Students[] studentsArray4 = new Students[studentsArray1.length+studentsArray2.length];

        TestStudent3 t = new TestStudent3();
        t.MergeSort(studentsArray3,0,studentsArray3.length-1,studentsArray4);

        System.out.println("Отсортированный список:");
        for (Students s: studentsArray4) {
            System.out.println(s);
        }
    }
}
