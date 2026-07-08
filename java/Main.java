class Employee {

    private int empId;
    private String name;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {

        if (salary > 0)
            this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setName("Rahul");
        emp.setSalary(50000);

        System.out.println("ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}