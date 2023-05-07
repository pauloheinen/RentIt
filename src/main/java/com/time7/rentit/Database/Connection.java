package com.time7.rentit.Database;

import com.time7.rentit.Utilities.PersistenceUtils.PersistenceUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Paulo Henrique
 */
public class Connection {
    
    private static Connection conn;
    private static EntityManagerFactory managerFactory;
    private static EntityManager manager;
    
    private Connection() {
        try {
            managerFactory = PersistenceUtil.loadConnectionInfo();
            manager = managerFactory.createEntityManager();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() {
        if (conn == null) {
            conn = new Connection();
        }
        if (isClosed()) {
            open();
        }
        return conn;    
    }
    
    private static void open() {
        manager = managerFactory.createEntityManager();
        manager.getTransaction().begin();
    }

    private static void close() {
        manager.close();
    }

    private static void commit() {
        manager.getTransaction().commit();
    }
    
    public static boolean isClosed() {
        return ! manager.isOpen();
    }

    public void add(Object object) {
        open();
        
        manager.persist(object);
        
        commit();
        close();
    }

    public void update(Object object) {
        open();
        
        manager.merge(object);
        
        commit();
        close();
    }
    
    public void delete(Object object) {
       open();
       
       manager.remove(object);
       
       commit();
       close();
    }
    
    public <T> T find(Class<T> aClass, Object object) {
        open();
        
        Object find = null;
        try {
            if (object instanceof Integer)
            {
                object = Long.valueOf(String.valueOf(object));
            }
        
            find = manager.find(aClass, object);
        } catch( Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return (T) find;
    }
}
