
package animal4;


public class Q4 {
    public static void main(String[] args) {
        Animal4 lion=new Lion();
        Animal4 tiger=new Tiger();
        Animal4 deer=new Deer();
        
        System.out.println("Lion\n");
        lion.eat();
        lion.sleep();
        System.out.println("\nTiger\n");
        tiger.eat();
        tiger.sleep();
        System.out.println("\nDeer\n");
        deer.eat();
        deer.sleep();
        
        
    }
}
