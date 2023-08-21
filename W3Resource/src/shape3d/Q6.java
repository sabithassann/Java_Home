
package shape3d;


public class Q6 {
    public static void main(String[] args) {
        double radiusSphere=7.0;
        double slideLengthCube=6.0;
        
        Shape3D sphere=new Sphere(radiusSphere);
        Shape3D cube=new Cube(slideLengthCube);
        
        System.out.println("Radius of Sphere: "+radiusSphere);
        System.out.println("Sphere Volume: "+sphere.calculateVolume());
        System.out.println("Sphere Surface Area: "+sphere.calculateSurfaceArea());
        System.out.println("");
        System.out.println("SlideLength of Cube: "+slideLengthCube);
        System.out.println("Cube Volume: "+cube.calculateVolume());
        System.out.println("Cube Surface Area: "+cube.calculateSurfaceArea());
    }
}
