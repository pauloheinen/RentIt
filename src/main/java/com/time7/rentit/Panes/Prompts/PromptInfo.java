package com.time7.rentit.Panes.Prompts;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Henrique
 */
public class PromptInfo {
    
    public static void PromptInfo( Component root, String message ) {
        JOptionPane.showMessageDialog(root, message, "Informação", 1);
    }
    
    public static void PromptWarning( Component root, String message ) {
        JOptionPane.showMessageDialog(root, message, "Atenção", 2);
    }
    
    public int PromptQuestion( Component root, String message ) {
        int option = JOptionPane.showConfirmDialog(root, message, "", JOptionPane.YES_NO_OPTION, 3);
        return option;
    }
}
