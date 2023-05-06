package com.time7.rentit;

import com.time7.rentit.Panes.PromptError;
import com.time7.rentit.Panes.RentItWindow;

/**
 *
 * @author Paulo Henrique
 */
public class Launch {
    
    public static void main( String[] args ) {
        java.awt.EventQueue.invokeLater(() -> {
            new PromptError().setVisible(true);
        });
    }
}
