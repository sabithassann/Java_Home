
package shape3d;


public class Sphere extends Shape3D{
    
    protected double radius;

    public Sphere() {
    }

    public Sphere(double radius) {
        this.radius = radius;
    }
    
    

    @Override
    public double calculateVolume() {
        double v=(4.0/3.0)*(Math.PI*radius*radius*radius);
        return v;
    }

    @Override
    public double calculateSurfaceArea() {
        double a=4*Math.PI*radius*radius;
        return a;
    }
    
}
