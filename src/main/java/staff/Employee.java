package staff;

public class Employee {

    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNI() {
        return this.NI;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double increase) {
        if(increase > 0) {
            this.salary += increase;
        }
    }

    public double payBonus() {
        return this.salary * .01;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
