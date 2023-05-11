package com.time7.rentit;

import com.time7.rentit.Panes.LoginPane;
import com.time7.rentit.Panes.Prompts.PromptInfo;
import javax.swing.JFrame;

/**
 *
 * @author Paulo Henrique
 */
public class Launch {
    
    public static void main( String[] args ) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPane().setVisible(true);
            PromptInfo.PromptInfo(null, "aviso!");
        });
    }
}
