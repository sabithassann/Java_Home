
package q1;

import java.util.Arrays;
import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int myArray[]=new int[100];
        for(int i=0;i<myArray.length;i++){
            myArray[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(myArray));
        
        System.out.println("Enter index number");
        int input=sc.nextInt();
        
        try {
            int num=myArray[input];
            
            System.out.println(num+" is located "+input+" no index");
        } catch (Exception e) {
            System.out.println("out of bound");
        }
    }
}
