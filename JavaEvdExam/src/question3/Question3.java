
package question3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import student.Student;


public class Question3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        student.Student student=new Student();
        
        Student[] students={
            new Student("Hasan",20),
            new Student("sabit",20),
            new Student("nahid",20),
            new Student("santo",20),
            
        };
        
        
        FileOutputStream fileoutputstream=new FileOutputStream("Student.dat");
        ObjectOutput objectOutput=new ObjectOutputStream(fileoutputstream);
        
        objectOutput.writeObject(students);
        
        FileInputStream fileInputStream=new FileInputStream("student.dat");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        
        Student[] newStudents=(Student[]) objectInputStream.readObject();
        System.out.println(Arrays.toString(newStudents));
    }
}
