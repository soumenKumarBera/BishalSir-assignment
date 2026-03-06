package student_soumen_oop_assignment.qs17;

public class PartTimeEmployee extends Employee {
    int hoursWork;
    double perHourseRate;


    public PartTimeEmployee(String name, int hoursWork, double perHourseRate) {
        super(name);
        this.hoursWork = hoursWork;
        this.perHourseRate = perHourseRate;
    }

    @Override
    double calculateSalary() {
        return hoursWork * perHourseRate;
    }
}
