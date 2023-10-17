package lab_07_01;

public class Employee {
    //class level/ class scope
    private String name;
    private int salary;

   //noi lap trinh vien xu ly dac biet init khi khoi tao 1 gia tri dac biet nao do.
    //new ..
    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
