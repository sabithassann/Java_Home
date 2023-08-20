
package shape;


public class Circle extends Shape{
   protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
   
   
    
    @Override
    double calculateArea() {
        double area=Math.PI*radius*radius;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }
    
}
