
package ObjectMethod;


public class Java06_08_2023MethodObj {
       String name;
       String color;
       int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
       
       public  void procuctPrice() {
           System.out.println("The product is "+name+"The color is "+color+"And the price is "+price);
        
    }
}
