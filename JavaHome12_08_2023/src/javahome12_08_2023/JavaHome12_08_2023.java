
package javahome12_08_2023;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class JavaHome12_08_2023 {


    public static void main(String[] args) throws FileNotFoundException {
       
//        Scanner sc=new Scanner(System.in);
        


        
//        if(input1==0){
//            System.out.println("Your first input is Zero "
//                    + "so the result is 0");
//            
//        }
//        else if(input2 !=0){
//            int result=input1/input2;
//            System.out.println(result);
//        }else if(input2==0){
//            System.out.println("Divisor cannot be Zero");
//        }else{
//            System.out.println("end");
//        }

//        int input1=sc.nextInt();
//        int input2=sc.nextInt();
//        int result=0;
////        if(input2!=0){
////        
////        }
//         try {
//             result=input1/input2;
//             System.out.println("result "+result);
//        } catch (Exception e) {
//             System.out.println("you enter Zero in input 1");
//             
//        }

//
//        File file=new File("C:\\Users\\nahid\\Desktop\\javahome12_08_2023.txt");
//        
//        System.out.println(file.exists());
//        
//        PrintWriter pw=new PrintWriter(file);
//        pw.println("his exception will be thrown by the {@link FileInputStream}, {@link"
//                + " * FileOutputStream}, and {@link RandomAccessFile} constructors when a file"
//                + " * with the specified pathname does not exist.  It will also be thrown by these");

//         pw.close();


     
     File myFile=new File("C:\\Users\\nahid\\Desktop\\TenLineText.txt");
     Scanner output = new Scanner(myFile);
        int count = 0;
        String next = "";
        String matchText = "";
        String sourceText = "dolor";
        int i = 1;
        while (output.hasNext()) {
            //read file and store 10 word in next Variable
            matchText = output.next();

            if (matchText.matches(sourceText)) {
                for (int j = 0; j < 10; j++) {
                    next += output.next() + " ";
                    count++;
                    if (count == 10) {
                        //print 10 word
                        System.out.println("line " + i + " " + next);
                        //restart count word
                        next = "";
                        count = 0;
                        //count line
                        i++;
                    }
                }

            }

        }
        //close file
        output.close();
       
    }
    
}
