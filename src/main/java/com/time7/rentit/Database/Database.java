package com.time7.rentit.Database;

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
   
   public <T> T findById(Class<T> aClass, Object object) {
        return getConnection().findById(aClass, object);
    }

    public <T> T findObjectBySql(Class<T> aClass, String sql) {
        return getConnection().findObjectBySql(aClass, sql);
    }
}
