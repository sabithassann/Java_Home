
package shape;

import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("For Calculation of Circle");
        double input=sc.nextDouble();
        
        System.out.println("For Calculation of Triangle");
        double side1=sc.nextDouble();
        double side2=sc.nextDouble();
        double side3=sc.nextDouble();
        
        Shape circle=new Circle(input);
        Shape triangle=new Triangle(side1, side2, side3);
        
        System.out.println("Cirle area of "+input+" is "+circle.calculateArea());
        System.out.println("Circle perimeter of "+input+" is "+circle.calculatePerimeter());
        
        System.out.println("");
        System.out.println("Triangle area of "+side1+" ,"+side2+" ,"+side3+" is "+triangle.calculateArea());
        System.out.println("Triangle perimeter of "+side1+" ,"+side2+" ,"+side3+" is "+triangle.calculatePerimeter());
        
        
    }
}
