package com.time7.rentit;

import com.time7.rentit.Panes.HomePane.ManagerPane;
import com.time7.rentit.Prompts.Prompts;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Paulo Henrique
 */
public class Launch {
    
    public static void main( String[] args ) {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");    
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            Prompts.promptError(null, e);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new ManagerPane().setVisible(true);
        });
    }
}
