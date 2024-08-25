public class PartTimeEmployee extends Employee{
    private int hoursWorkded;
    private double hourlyRate;

    PartTimeEmployee(String name, int id, double salary, int hoursWorkded, double hourlyRate){
        super(name,id,salary);
        this.hoursWorkded = hoursWorkded;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return this.hoursWorkded * this.hourlyRate;
    }
}
