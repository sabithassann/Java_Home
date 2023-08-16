
package javaevdexam;

import java.util.Arrays;
import java.util.Scanner;


public class JavaEvdExam {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        Scanner input = new Scanner(System.in);
        int [] myArray  = new int [100];
        for(int i=0; i<myArray.length; i++){
             myArray[i] = (int) (Math.random()*100);
           
        }
        System.out.println(" My Array: "+ Arrays.toString(myArray));
        System.out.println("Enter a index number:");
        int indexNumber= input.nextInt();
        try {
            int num=myArray[indexNumber];
            System.out.println(num + " is located at "+indexNumber+" no index.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
    
}
