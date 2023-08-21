
package employee;


public class Q5 {
    public static void main(String[] args) {
        Employee manager=new Manager(5000, "sabit", 20000);
        Employee programer=new Programer(50, 100, "Nahid", 15000);
        
        manager.displayInfo();
        System.out.println("");
        programer.displayInfo();
    }
}
