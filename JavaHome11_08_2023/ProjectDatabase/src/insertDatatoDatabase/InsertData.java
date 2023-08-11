
package insertDatatoDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertData {
    public static void main(String[] args) {
        Connection connection=null;
        
        try {
            String url="jdbc:mysql://localhost:3306/sabit";
            String username="root";
            String password="sabit@1234";
            
          connection =DriverManager.getConnection(url, username, password);
          
          String insertQuery="INSERT INTO threedemodata (id,name,about)   VALUES (?,?,?)";
          int id=1;
          String name="sabit";
          String about="JEE R-55 Trainee";
          
            try (PreparedStatement preparedStatment=connection.prepareStatement(insertQuery)){
                
                preparedStatment.setInt(1, id);
                preparedStatment.setString(2, name);
                preparedStatment.setString(3, about);
                
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
