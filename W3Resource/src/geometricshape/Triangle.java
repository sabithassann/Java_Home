
package geometricshape;


public class Triangle extends GeometricShape{
    
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle() {
    }

    public Triangle(double slide1, double slide2, double slide3) {
        this.side1 = slide1;
        this.side2 = slide2;
        this.side3 = slide3;
    }
    
    

    @Override
    public double area() {
        double semiePerimeter=(side1+side2+side3)*0.5;
        double area=Math.sqrt(semiePerimeter*(semiePerimeter-side1)*(semiePerimeter-side2)*(semiePerimeter-side3));
        return area;
        
        
    }

    @Override
    public double perimeter() {
        double p=side1+side2+side3;
        return p;
    }


    
}
