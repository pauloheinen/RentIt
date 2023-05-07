package com.time7.rentit.Utilities.PersistenceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Paulo Henrique
 */
public class PersistenceUtil {
    
    public static EntityManagerFactory loadConnectionInfo() {
        String[] paramsArray = new String[3];
        paramsArray = getDatabaseParams();
        
        Map<String, String> persistenceMap = new HashMap<>();
        
        persistenceMap.put("javax.persistence.jdbc.url", paramsArray[0]);
        persistenceMap.put("javax.persistence.jdbc.user", paramsArray[1]);
        persistenceMap.put("javax.persistence.jdbc.password", paramsArray[2]);
        persistenceMap.put("javax.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
        
        return Persistence.createEntityManagerFactory("rentitdbPU", persistenceMap);
    }
    
    public static String[] getDatabaseParams() {
        String[] databaseParamsArray = new String[3];
        int cont = 0;
        
        String projectDir = System.getProperty("user.dir");
        
        File file = new File (projectDir + File.separator + "database-connection.txt");
        
        Scanner readFile;
                
        try {
            readFile = new Scanner( file );
            while ( readFile.hasNextLine() ) {
                String line = (readFile.nextLine());
                databaseParamsArray[cont] = line.substring(line.indexOf("\"") + 1,line.lastIndexOf("\""));
                cont ++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return databaseParamsArray;
    }
}