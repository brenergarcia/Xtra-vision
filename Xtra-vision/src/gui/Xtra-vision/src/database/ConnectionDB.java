/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author brener
 */
public class ConnectionDB {
    
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    private String driver;
    private String path = "jdbc:mysql://52.50.23.197:3306/Brener_2019330?useSSL=false";
    private String user = "Brener_2019330";
    private String passwd = "2019330";
    
       
//   method to connect with the database
//    public Connection getConnection(){
//    
//        try{
//            System.setProperty("jdbc.Drivers", driver);
//            con=DriverManager.getConnection(path, user, passwd);
//            System.out.println("Connected");
//            return con;
//        
//        }catch (SQLException ex){
//            JOptionPane.showMessageDialog(null, "Impossible to connect to the database! \n"+ex.getMessage());
//        }
//        return null;
//    
//    }
     
    public java.sql.Connection getConnection() {
        try {
               return con=DriverManager.getConnection("jdbc:mysql://52.50.23.197:3306/Brener_2019330?useSSL=false","Brener_2019330","2019330");
               
        } catch(SQLException ex) {
               throw new RuntimeException(ex);
               
        }
    }
    
    //method to close the connection with database
    public void disconnect(){
    
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Could not disconnect from the database! \n"+ex.getMessage());
        }
    
    }
    
//    public String executeSQL (String SQL) throws SQLException{
        
        

//    public void executeSQl() {
//        try {
//            Statement stmt = con.createStatement();
//
//            // Prepare a statement to show the records
//            String sql = "SELECT * FROM movies";
//
//            // Execute the insert statement
//           // stmt.executeUpdate(sql);
//        } catch (SQLException e) {
//        } 
//
//        }
//    
     
    
}
