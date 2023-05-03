package com.time7.rentit.Schemas;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;

/**
 *
 * @author Paulo Henrique
 */
public class QueryResult {
    
    private ResultSet resultSet;
        
    private int rowIndex = 0;
    private int columnIndex = 0;

    public QueryResult( ResultSet rs ) {
        this.resultSet = rs;
    }
    
    public void close() throws SQLException {
        if ( resultSet != null ) {
            Statement statement = resultSet.getStatement();

            resultSet.close();
            
            if ( ! ( statement instanceof PreparedStatement ) ) {
                statement.close();
            }

            rowIndex = 0;
            columnIndex = 0;
            
            resultSet = null;
        }
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet( ResultSet value ) {
        this.resultSet = value;
    }
    
    public int getColumnIndex() {
        return columnIndex;
    }
    
    public void setColumnIndex( int value ) {
        columnIndex = value;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex( int value ) {
        rowIndex = value;
    }

    public boolean next() throws SQLException {
        boolean hasNext = false;

        if ( resultSet != null ) {
            hasNext = resultSet.next();

            if ( ! hasNext ) {
                close();
            }
            
            else {
                rowIndex++;
                columnIndex = 1;
            }
        }

        return hasNext;
    }

    public int getInt() throws SQLException {
        return resultSet.getInt( columnIndex++ );
    }

    public int getInt( int column ) throws SQLException {
        return resultSet.getInt( column );
    }

    public int getInt( String column ) throws SQLException {
        return resultSet.getInt( column );
    }

    public long getLong() throws SQLException {
        return resultSet.getLong( columnIndex++ );
    }

    public long getLong( int column ) throws SQLException {
        return resultSet.getLong( column );
    }

    public long getLong( String column ) throws SQLException {
        return resultSet.getLong( column );
    }

    public double getDouble() throws SQLException {
        return resultSet.getDouble( columnIndex++ );
    }

    public double getDouble( int column ) throws SQLException {
        return resultSet.getDouble( column );
    }

    public double getDouble( String column ) throws SQLException {
        return resultSet.getDouble( column );
    }

    public String getString() throws SQLException {
        return getString( columnIndex++ );
    }

    public String getString( int column ) throws SQLException {
        String s = resultSet.getString( column );

        if ( s == null ) {
            s = "";
        }

        else if ( s.equals( " " ) ) {
            s = "";
        }

        return s;
    }

    public String getString( String column ) throws SQLException {
        String s = resultSet.getString( column );
        
        if ( s == null ) {
            s = "";
        }

        else if ( s.equals( " " ) ) {
            s = "";
        }

        return s;
    }

    public Date getDate() throws SQLException {
        return resultSet.getDate( columnIndex++ );
    }

    public Date getDate( int column ) throws SQLException {
        return resultSet.getDate( column );
    }

    public Date getDate( String column ) throws SQLException {
        return resultSet.getDate( column );
    }
    
    public Time getTime() throws SQLException {
        return resultSet.getTime( columnIndex++ );
    }

    public Time getTime( int column ) throws SQLException {
        return resultSet.getTime( column );
    }

    public Time getTime( String column ) throws SQLException {
        return resultSet.getTime( column );
    }

    public Timestamp getTimestamp() throws SQLException {
        return resultSet.getTimestamp( columnIndex++ );
    }

    public Timestamp getTimestamp( int column ) throws SQLException {
        return resultSet.getTimestamp( column );
    }

    public Timestamp getTimestamp( String column ) throws SQLException {
        return resultSet.getTimestamp( column );
    }

    public boolean wasNull() throws SQLException {
        return resultSet.wasNull();
    }

    public boolean getBoolean() throws SQLException {
        return resultSet.getBoolean( columnIndex++ );
    }
    
    public boolean getBoolean( int column ) throws SQLException {
        return resultSet.getBoolean( column );
    }
    
    public boolean getBoolean( String column ) throws SQLException {
        return resultSet.getBoolean( column );
    }
}