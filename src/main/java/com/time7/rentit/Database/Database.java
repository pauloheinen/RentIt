/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.time7.rentit.Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Paulo Henrique
 */
public class Database {
    
    private static Database db;
    
    private Connection conn;
    
    private Database() {
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
            String url = "localhost:3306";
            String user = "root";
            String password = "280519";
            
            conn = DriverManager.getConnection( url, user, password );
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
    
    public static Database getInstance() {
        if ( db == null )
        {
            db = new Database();
        }
        
        return db;
    }
}
