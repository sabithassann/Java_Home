
package vehicle;


public abstract class Vehicle {
    
    public String registrationNumber;
    public String brand;
    public int year;

    public Vehicle() {
    }

    public Vehicle(String registrationNumber, String brand, int year) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.year = year;
    }
    
    
    
    public abstract void start();
    public abstract void stop();
}
