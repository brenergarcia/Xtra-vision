/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Movie;

/**
 *
 * @author brener
 */
public class MovieDao {
    
    private Connection connection;
    int id;
    String name;
    float price;
    
    public MovieDao(){ 
        this.connection = new ConnectionDB().getConnection();
    } 
    public void check(Movie movie){ 
        String sql = "SELECT * FROM movies";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, movie.getName());
            stmt.setFloat(2, movie.getPrice());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
    }
}
