package com.time7.rentit.Database;

import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Utilities.PersistenceUtils.PersistenceUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;

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
            Prompts.promptError(null, e);
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
        
        Object merge = manager.merge(object);
        manager.remove(merge);
       
        commit();
        close();
    }
    
    public <T> T findById(Class<T> aClass, Object object) {
        open();
        
        Object find = null;
        try {
            if (object instanceof Integer)
            {
                object = Long.valueOf(String.valueOf(object));
            }
        
            find = manager.find(aClass, object);
        } catch(NumberFormatException e) {
            Prompts.promptError(null, e);
        } finally {
            close();
        }
        
        return (T) find;
    }

    public <T> T findSingleBySql(Class<T> aClass, String sql) {
        open();
        
        T find;
        
        try {
            find = (T) manager.createQuery(sql).getSingleResult();
        } catch (NoResultException e) {
            find = null;
        }
        
        finally {
            close();
        }
        
        return find;
    }
    
    public <T> List<T> findAllBySql(Class<T> aClass, String sql) {
        open();
        
        List <T> find;
        
        try {
            find = manager.createQuery(sql).getResultList();
        } catch (NoResultException e) {
            find = new ArrayList<>();
        }
        
        finally {
            close();
        }
        
        return find;
    }
}