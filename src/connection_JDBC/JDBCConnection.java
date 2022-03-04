/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author dell
 */
public class JDBCConnection {
    public static Connection JDBCConnection() {
        final String Url = "jdbc:sqlserver://THUYDUNG\\SQLEXPRESS:1433;databaseName=QuanLySach";
        final String user = "sa";
        final String pass = "h2fsbf6.k2cr2o7";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }
    public static void main(String[] args){
    Connection connection = JDBCConnection();
       if (connection !=  null){
           System.out.println("thanh cong");
       }
       else 
            System.out.println("that bai");
    }
    
}
