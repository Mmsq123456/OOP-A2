//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Employee extends Person {
    private String jobPosition;
    private int salary;

    public Employee() {
    }

    public Employee(String name, char gender, int age, String jobPosition, int salary) {
        super(name, gender, age);
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getJobPosition() {
        return this.jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        String var10000 = super.toString();
        return "Employee:" + var10000 + "\t" + this.jobPosition + "\t" + this.salary;
    }
}
