package com.time7.rentit.Utilities.PersistenceUtils;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Paulo Henrique
 */
public class PersistenceUtil {
    
    public static EntityManagerFactory loadConnectionInfo() {
        Map<String, String> persistenceMap = new HashMap<>();

        persistenceMap.put("javax.persistence.jdbc.url", "jdbc:mysql://localhost:3306/rentitdb");
        persistenceMap.put("javax.persistence.jdbc.user", "root");
        persistenceMap.put("javax.persistence.jdbc.password", "root");
        persistenceMap.put("javax.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
        
        return Persistence.createEntityManagerFactory("rentitdbPU", persistenceMap);
    }
    
}
