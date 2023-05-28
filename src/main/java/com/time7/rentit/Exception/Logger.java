package com.time7.rentit.Exception;

import java.util.logging.Level;

/**
 *
 * @author Paulo Henrique
 */
public class Logger {
    
    public static void logException(Exception e) {
        java.util.logging.Logger.getLogger(e.getClass().getName()).log(Level.SEVERE, null, e);
    }
}
