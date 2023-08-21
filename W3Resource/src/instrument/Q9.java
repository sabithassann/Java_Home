
package instrument;


public class Q9 {
    public static void main(String[] args) {
        Instrument glockenspiel=new Glockenspiel();
        Instrument violin=new Violin();
        
        glockenspiel.play();
        glockenspiel.tune();
        System.out.println("");
        violin.play();
        violin.tune();
    }
    
}
