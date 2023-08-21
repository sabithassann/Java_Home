
package employee;


public class Manager extends Employee{
    
    protected double bonus;

    public Manager() {
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(double bonus, String name, double baseSalary) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    
    

    @Override
    public double calculateSalary() {
        double totalBonus=baseSalary+bonus;
        return totalBonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager name: "+name);
        System.out.println("Base salary: "+baseSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary After bonus: "+calculateSalary());
    }


    
}
