
package javaevdexam;

import vehicle.Car;
import vehicle.Motorcycle;
import vehicle.Vehicle;


public class Question2 {
    public static void main(String[] args) {
        vehicle.Vehicle mycar=new Car();
        vehicle.Vehicle myMotorCycle=new Motorcycle();
        
        mycar.start();
        mycar.stop();
        System.out.println("");
        myMotorCycle.start();
        myMotorCycle.stop();
    }
}
