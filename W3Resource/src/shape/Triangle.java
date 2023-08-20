
package shape;


public class Triangle extends Shape{
    
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    

    @Override
    double calculateArea() {
        double s=0.5*(side1+side2+side3);
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter=side1+side2+side3;
        return perimeter;
    }
    
}
