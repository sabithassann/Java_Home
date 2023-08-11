
package scannerInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class InsertDataWithScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Connection connection=null;
        
        try {
            String url="jdbc:mysql://localhost:3306/sabit";
            String username="root";
            String password="sabit@1234";
            
          connection =DriverManager.getConnection(url, username, password);
          
          String insertQuery="INSERT INTO insertdatascanner (id,name,about,rate)   VALUES (?,?,?,?)";
          
            System.out.println("Please insert INT type Id number");
            int id=sc.nextInt();
            sc.nextLine();//important
            System.out.println("Please insert STRING type name");
            String name=sc.nextLine();
            System.out.println("About you STRING type");
            String about=sc.nextLine();
            System.out.println("Rate this INT type");
            int rate=sc.nextInt();
            sc.nextLine();//important after int
          
          
            try (PreparedStatement preparedStatment=connection.prepareStatement(insertQuery)){
                
                preparedStatment.setInt(1, id);
                preparedStatment.setString(2, name);
                preparedStatment.setString(3, about);
                preparedStatment.setInt(4, rate);
                
                int rowAffected=preparedStatment.executeUpdate();
                System.out.println(rowAffected+" row(s) inserted");
            } catch (Exception e) {
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(connection !=null){
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
