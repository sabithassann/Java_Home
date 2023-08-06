
package javaclass06_08_2023;

import Getter.GetMethod;
import ObjectMethod.Java06_08_2023MethodObj;


public class JavaClass06_08_2023 {


    public static void main(String[] args) {
//        Java06_08_2023MethodObj1 product=new Java06_08_2023MethodObj1();
//        Java06_08_2023MethodObj1 product1=new Java06_08_2023MethodObj1();
//        
//        product.procuctPrice();
//        
//        product.name="pen";





           Java06_08_2023MethodObj product2=new Java06_08_2023MethodObj();
           Java06_08_2023MethodObj product3=new Java06_08_2023MethodObj();
           
           product2.setName("Bat");
           product3.setPrice(15000);
           
           product2.procuctPrice();
           System.out.println();
           product3.procuctPrice();
           
           
           
           GetMethod circle=new GetMethod();
           circle.setRadius(5.5);
 
           
           double radius =circle.getRadius();
           
           System.out.println();
           System.out.println("Circle radius is "+radius);
        
        
        
        
        

        
        
            
    }
    
}
