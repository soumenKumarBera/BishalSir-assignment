package student_soumen_oop_assignment.qs17;

public class FullTimeEmployee extends Employee {
    double mothlyShalary;

    public FullTimeEmployee(String name, double mothlyShalary) {
        super(name);
        this.mothlyShalary = mothlyShalary;
    }

    @Override
    double calculateSalary() {
        return this.mothlyShalary;
    }
}
