package lab_07_01;

import java.util.List;

public class EmployeeController { // xu ly model, process model
    public static int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }

        return totalSalary;
    }
}
