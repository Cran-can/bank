package bankManagementSystem;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingSystem","root","Cran@1243mysql");
            statement=connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
