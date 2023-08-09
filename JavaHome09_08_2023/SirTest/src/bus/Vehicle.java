
package bus;


public class Vehicle extends Bus{

public int speed;

    public Vehicle() {
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public Vehicle(int speed, int noOfSeats, String color) {
        super(noOfSeats, color);
        this.speed = speed;
    }

    @Override
    public void printdetails() {
        System.out.println("No of seat "+noOfSeats);
       System.out.println("Color "+color);
        System.out.println("The speed is "+speed+" KMH");
    }







   


    
}
