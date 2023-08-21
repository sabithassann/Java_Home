
package person;


public class LazyPerson extends Person{

    @Override
    public void eat() {
        System.out.println("LazyPerson Eats: Eats unhealthy food,chips,cokes,pizza etc");
    }

    @Override
    public void exercise() {
        System.out.println("LazyPerson Exersice: Do no Exercise ,Watch movie all day and eat");
    }
    
}
