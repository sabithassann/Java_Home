
package person;


public class Q8 {
    public static void main(String[] args) {
        Person athlete =new Athlete();
        Person lazyPerson=new LazyPerson();
        
        athlete.eat();
        athlete.exercise();
        System.out.println("");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
