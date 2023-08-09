
package bus;


public class Bus {
    
    public int noOfSeats;
    public String color;

    public Bus() {
    }

    public Bus(int noOfSeats, String color) {
        this.noOfSeats = noOfSeats;
        this.color = color;
    }

   public void printdetails(){
       System.out.println("No of seat "+noOfSeats);
       System.out.println("Color "+color);
   }
}
