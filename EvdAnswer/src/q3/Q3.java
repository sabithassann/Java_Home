
package q3;

import vehicle.Car;
import vehicle.MotorCycle;


public class Q3 {
    public static void main(String[] args) {
        vehicle.Vehicle car=new Car();
        vehicle.Vehicle motorcycle=new MotorCycle();
        
        car.start();
        car.stop();
        System.out.println("");
        motorcycle.start();
        motorcycle.stop();
    }
}
