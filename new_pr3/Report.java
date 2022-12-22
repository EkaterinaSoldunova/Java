import java.util.Formatter;

public class Report {
    public static void generateReport(Employee[] arr){
        for (int i=0;i<arr.length;i++){
            Formatter fmt = new Formatter();
            fmt.format("%-15s %15.2f",arr[i].fullname, arr[i].salary);
            System.out.println(fmt);
        }
    }
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr[0] = new Employee("Kate", 512456.2345678);
        arr[1] = new Employee("Ron", 30000.34567);
        arr[2] = new Employee("Tom", 100000.0);
        Report r = new Report();
        r.generateReport(arr);
    }
}
