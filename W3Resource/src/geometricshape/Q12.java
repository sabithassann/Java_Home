
package geometricshape;


public class Q12 {
    public static void main(String[] args) {
        
        GeometricShape triangle=new Triangle(4, 5, 6);
        GeometricShape square=new Square(6);
        
        System.out.println("Triangle Area: "+triangle.area());
        System.out.println("Triangle perimeter: "+triangle.perimeter());
        
        System.out.println("Square Area: "+square.area());
        System.out.println("Square Perimeter: "+ square.perimeter());

    }
}
