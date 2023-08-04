
package javahome04_08_2023;

import java.util.Arrays;


public class JavaHome04_08_2023 {

   
    public static void main(String[] args) {
        
        
        int [][] declare;
        int declare1 [][]; //declare two dimensional array
        
        declare=new int [5][5];//for insert or inisialize value 
        
//        System.out.println(Arrays.deepToString(declare));


//         int [][] raggedArray={
//             {1,2,3,4,5},{1,2,3,4},{1,2,3},{1,2},{1,2}
//         };
//         for(int[] val :raggedArray){
//             for(int element : val){
//                 System.out.print(element+" ");
//             }
//             System.out.println();
//         }
         
         
         int [][] ragged={
             {1,2,3,4} ,{1,2} 
         };
//         System.out.println(Arrays.deepToString(ragged));
         for(int[] val: ragged){
             System.out.println(Arrays.deepToString(val));
         }

        
        
        
    }
    
}
