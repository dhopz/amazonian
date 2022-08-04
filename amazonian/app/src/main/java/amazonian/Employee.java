package amazonian;

public class Employee {
    private String name;
    private Integer employeeId;
    final double payRate = 1000;

    public Employee(String name, Integer employeeId) {
        this.name = name;
        this.employeeId= employeeId;
    }

    public String getName() {
        return this.name;
    }
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    public double getPayRate() {
        return this.payRate;
    }
    
}
