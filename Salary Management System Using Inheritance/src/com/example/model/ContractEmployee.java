public class ContractEmployee extends Employee{
    private int contractDuration;
    private double contractAmount;

    ContractEmployee(String name, int id, double salary, int contractDuration, int contractAmount){
        super(name, id, salary);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return this.contractAmount /this.contractDuration;
    }
}
