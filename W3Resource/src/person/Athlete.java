
package person;


public class Athlete extends Person{

    @Override
    public void eat() {
        System.out.println("Athlete Eats: Full of iron,potasium,calsium food");
    }

    @Override
    public void exercise() {
        System.out.println("Athlete exercise: do Pushup,run 10Km a day,do exercise");
    }
    
}
