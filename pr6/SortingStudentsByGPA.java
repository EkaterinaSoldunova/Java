
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Students>{
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
    public void quickSort(Students[] arr, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Students pivot = arr[(leftMarker + rightMarker) / 2];
        do {
            while (compare(arr[leftMarker],pivot)==1) { //<
                leftMarker++;
            }
            while (compare(arr[rightMarker],pivot)==-1) { //>
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Students tmp = arr[leftMarker];
                    arr[leftMarker] = arr[rightMarker];
                    arr[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(arr, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(arr, leftBorder, rightMarker);
        }
    }
}