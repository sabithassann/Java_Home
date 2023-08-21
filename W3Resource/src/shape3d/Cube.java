
package shape3d;


public class Cube extends Shape3D{
    
    protected double slideLength;

    public Cube() {
    }

    public Cube(double slideLength) {
        this.slideLength = slideLength;
    }
    
    

    @Override
    public double calculateVolume() {
        double v=slideLength*slideLength*slideLength;
        return v;
    }

    @Override
    public double calculateSurfaceArea() {
        double a=6*(slideLength*slideLength);
        return a;
    }
    
}
