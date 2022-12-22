public class Task2 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Екатерина");
        employee.setSalary(100000);

        EmployeeView view = new EmployeeView();

        EmployeeContoller contoller = new EmployeeContoller(employee,view);
        contoller.updateView();

        contoller.setEmployeeSalary(200000);
        contoller.setEmployeeName("Солдунова Е.С.");
        System.out.println("\nИзменение:");
        contoller.updateView();
    }
}