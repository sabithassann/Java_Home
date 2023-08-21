
package employee;


public class Programer extends Employee{
    
    protected int overtimeHours;
    protected double hourlyRate;

    public Programer() {
    }

    public Programer(int overtimeHours, double hourlyRate) {
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    public Programer(int overtimeHours, double hourlyRate, String name, double baseSalary) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }
    
    

    @Override
    public double calculateSalary() {
        double totalSalayProgramer=baseSalary+(overtimeHours*hourlyRate);
        return totalSalayProgramer;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programer Name: "+name);
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("OvertimeHours: "+overtimeHours);
        System.out.println("Hourly Rate: "+hourlyRate);
        System.out.println("Total Salay: "+calculateSalary());
        
    }
    
}
