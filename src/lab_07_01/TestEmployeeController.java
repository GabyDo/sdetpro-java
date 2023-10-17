package lab_07_01;

import java.util.Arrays;

public class TestEmployeeController {
    public static void main(String[] args) {
        /**
         * Fetch data from db
         * select * from employee where position type = PTE
         * convert data into object
         */

        // 2 PTEs
        Employee teo = new PTE();
        Employee ti = new PTE();
        Employee tun = new PTE();

        //2 contractors
        Employee heo = new Contractor();
        Employee ga = new Contractor();

        //1 CEO
        Employee ceo = new CLevelEmp();

        int totalSalary = EmployeeController.getTotalSalary(Arrays.asList(teo,ti, tun, heo, ga, ceo));

        System.out.println("total salary is: " + totalSalary);
    }
}
