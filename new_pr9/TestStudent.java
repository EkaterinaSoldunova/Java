import java.util.Comparator;

public class TestStudent implements Comparator<Students>{
    @Override
    public int compare(Students s1, Students s2) {
        if (s1.id == s2.id) {
            return 0;
        }
        if (s1.id > s2.id) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public void insertionSort(Students[] myArray) {
        for (int left = 0; left < myArray.length; left++) {
            Students value = myArray[left];
            int i;
            for (i = left - 1; i >= 0; i--) {
                if (compare(value,myArray[i])==-1) {
                    myArray[i + 1] = myArray[i];
                } else {
                    break;
                }
            }
            myArray[i + 1] = value;
        }
    }
    public static void main(String[] args) {
        Students[] studentsArray = new Students[3];
        Students s1 = new Students(123, "Kate", 5);
        Students s2 = new Students(831, "Mary", 3);
        Students s3 = new Students(103,"Roby", 4);

        studentsArray[0]=s1;
        studentsArray[1]=s2;
        studentsArray[2]=s3;

        for (Students s: studentsArray) {
            System.out.println(s);
        }
        TestStudent iDNumber = new TestStudent();
        iDNumber.insertionSort(studentsArray);

        System.out.println("Sorted: ");
        for (Students s: studentsArray) {
            System.out.println(s);
        }
    }
}