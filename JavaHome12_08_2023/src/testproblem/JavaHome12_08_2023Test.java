
package testproblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JavaHome12_08_2023Test {
    
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\nahid\\Desktop\\testtext.txt");
        Scanner read=new Scanner(file);
        System.out.println(file.exists());
        
        
//            while (read.hasNextLine()) {
//            String line = read.nextLine();
//            System.out.println(line);
//            }
 
        
        String target="long";

        String forRead="";
        String forNext="";
        int count=0;
        //String forValue="";
        
        while (read.hasNext()) {   
            
            forRead=read.next();
            if(forRead.equals(target)){

                
                for(int i=0;i<10;i++){
                    forNext=forNext+read.next()+" ";

                    count++;//"correspondence" or "direct correspondence."
                     if (count==10) {
                         
                         System.out.println(forNext);
                      //forValue=forNext;
                      break;
                    
                    }
               
                }
                
            } 
            
        }
        //System.out.println(forValue);
        read.close();





    }
    
}
