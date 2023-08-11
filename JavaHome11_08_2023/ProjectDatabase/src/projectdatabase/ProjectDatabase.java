
package projectdatabase;

import java.sql.Connection;
import java.sql.DriverManager;


public class ProjectDatabase {


    public static void main(String[] args) {
        Connection connection=null;
        
        try {
            String url="jdbc:mysql://localhost:3306/sabit";
            String username="root";
            String password="sabit@1234";
            
            connection =DriverManager.getConnection(url, username, password);
                    
                    
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(connection != null){
                try {
                    connection.close();;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
