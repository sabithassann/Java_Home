
package evdanswer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import student.Student;


public class EvdAnswer {


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Student student=new Student();
        Student[] students={
            new Student("sabit", 25),
            new Student("santo", 25),
            new Student("nahid", 25),
        };
        
        FileOutputStream fileOutputStream=new FileOutputStream("student.dat");
        ObjectOutput objectOutput=new ObjectOutputStream(fileOutputStream);
        
        objectOutput.writeObject(students);
        
        
        FileInputStream fileInputStream=new FileInputStream("student.dat");
        ObjectInput objectInput=new ObjectInputStream(fileInputStream);
        
        Student[] read=(Student[])objectInput.readObject();
        System.out.println(Arrays.toString(read)); 
       
    }
    
}
