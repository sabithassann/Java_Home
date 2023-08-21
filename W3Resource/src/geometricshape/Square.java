
package geometricshape;


public class Square extends GeometricShape{
    
    protected double side;

    public Square() {
    }

    public Square(double slide) {
        this.side = slide;
    }

    @Override
    public double area() {
        double a=side*side;
        return a;
    }

    @Override
    public double perimeter() {
        double p=4*side;
        return p;
    }
    
    


    
}
