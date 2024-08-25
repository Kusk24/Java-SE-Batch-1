public class FullTimeEmployee extends Employee{
    private double allowance;
    private double bonus;
    FullTimeEmployee(String name, int id, double salary, double allowance, double bonus){
        super(name,id,salary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.getBasicSalary()+this.allowance+this.bonus;
    }

}
