package com.time7.rentit;

import com.time7.rentit.Panes.LoginPane;
import com.time7.rentit.Panes.Prompts.Prompts;
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
            Prompts.PromptError(null, e);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPane().setVisible(true);
        });
    }
    
    
}
