package com.time7.rentit.Panes.Prompts;

import java.awt.Component;
import java.io.File;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Henrique
 */
public class PromptInfo {
    
    private final URL url = getClass().getResource("/Images/alarm.png");
    
    public static void PromptInfo( Component root, String message ) {
        
        Icon infoIocn = new javax.swing.ImageIcon("/Images/alarm.png");
        
        JOptionPane.showMessageDialog( root, message, "Informação", JOptionPane.YES_OPTION, infoIocn);
    }
    
    public static void loadImage() {
        String fs = File.separator;
        
        String projectDir = System.getProperty("user.dir");
        
        File file = new File (projectDir + fs + "src" + fs + "main" + fs + "resources" + fs + "information.png");
        
    }
    
}
