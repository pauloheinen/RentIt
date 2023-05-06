package com.time7.rentit.Database;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Database {
    
    private static Connection conn;
    private static Database db;

    public static Database getInstance() {
        if (db == null) {
            db = new Database();
        }
        return db;
    }
    
    private Connection getConnection() {
        if (conn == null) {
            conn = Connection.getConnection();
        }
        return conn;
    }
    
    public void add(Object object) throws Exception {
        getConnection().add(object);   
    }
    
    public void update(Object object) {
       getConnection().update(object);
   } 
    
   public void delete(Object object) {
       getConnection().delete(object);
   }
   
   public <T> T find(Class<T> aClass, Object object) {
        return getConnection().find(aClass, object);
    }
    
    public void getInfoDataBase() {
        File file = new File("..\\..\\..\\..\\..\\..\\..\\database-connection.txt");
        Scanner readFile = null;
        String vector[] = new String[3];
        int cont =0;
        
        try {
            readFile = new Scanner( file );
            while ( readFile.hasNextLine() ) {
                String nome = (readFile.nextLine());
                vector[cont] = nome.substring(nome.indexOf("'") + 1,nome.lastIndexOf("'"));
                cont ++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if ( readFile != null ) {
                readFile.close();
            }
        }
        String url = vector[0];
        String user = vector[1];
        String password = vector[2];
        System.out.println("URL: "+ url + "\nUsuário: "+ user +"\nSenha: "+ password);
    }
}
