package com.time7.rentit.Database;

import com.time7.rentit.Fetchers.AbstractFetcher;
import com.time7.rentit.Fetchers.Fetcher;
import com.time7.rentit.Schemas.QueryResult;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Database {
    
    private static Database db;
    private Connection conn;
    private Statement smtm;
    
    private Database() {
        try {
            Class.forName( "com.mysql.jdbc.Driver" );

            String url = "jdbc:mysql://localhost:3306:rentit";
            String user = "admin";
            String password = "admin";
            
            conn = DriverManager.getConnection( url, user, password );
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
    
    public static Database getInstance() {
        if ( db == null ) {
            db = new Database();
        }
        return db;
    }

    public PreparedStatement prepareStatement( String sql ) throws Exception {
        return conn.prepareStatement( sql );
    }

    public void execute( PreparedStatement ps ) throws Exception {
        ps.execute();
    }
    
    public synchronized QueryResult executeQuery( String sql ) throws Exception {
        ResultSet rs = null;

        try {
            if ( conn != null && !conn.isClosed() ) {
                Statement s = conn.createStatement();

                rs = s.executeQuery( sql );
            }
        }

        catch ( SQLException e ) {
            e.printStackTrace();
        }

        QueryResult qr = new QueryResult( rs );
        
        return qr;
    }

    public synchronized QueryResult executeQuery( PreparedStatement ps ) throws Exception {
        ResultSet rs = ps.executeQuery();

        QueryResult qr = new QueryResult( rs );

        return qr;
    }

    public void rollback() throws Exception {
        conn.rollback();
    }

    public void setAutoCommit( boolean b ) throws Exception {
        conn.setAutoCommit( b );
    }
    
//    public <T> List<T> fetchMany( String sql, Fetcher<T> fetcher ) throws Exception;
//    {
//        List<T> result = new ArrayList<>();
//
//        QueryResult qr = execute( sql );
//
//        if ( qr != null )
//        {
//            while ( qr.next() )
//            {
//                result.add( fetch( qr, fetcher ) );
//            }
//
//            qr.close();
//        }
//
//        return result;
//    }

    public <T> List<T> fetchMany( PreparedStatement ps, Fetcher<T> fetcher ) throws Exception {
        List<T> result = new ArrayList<>();

        try ( ps ) {
            QueryResult qr = executeQuery( ps );

            if ( qr != null ) {
                while ( qr.next() ) {
                    result.add( fetch( qr, fetcher ) );
                }

                qr.close();
            }
        }

        return result;
    }
    
    public <T> T fetchOne( String sql, Fetcher<T> fetcher ) throws Exception {
        T result = null;

        QueryResult qr = executeQuery( sql );

        if ( qr != null ) {
            if ( qr.next() ) {
                result = fetch( qr, fetcher );
            }

            qr.close();
        }

        return result;
    }

    public <T> T fetchOne( PreparedStatement ps , Fetcher<T> fetcher ) throws Exception {
        T result = null;

        try ( ps ) {
            QueryResult qr = executeQuery( ps );

            if ( qr != null ) {
                if ( qr.next() ) {
                    result = fetch( qr, fetcher );
                }

                qr.close();
            }
        }

        return result;
    }

    /**
     * invokes the concrete fetcher and returns the object
     */
    private <T> T fetch( QueryResult qr, Fetcher<T> fetcher ) throws Exception
    {
        return fetcher instanceof AbstractFetcher ? ((AbstractFetcher<T>)fetcher).fetch( qr ) : fetcher.fetch( qr );
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
