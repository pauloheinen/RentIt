package com.time7.rentit.Panes;

import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class ManagerPane {
    
    public static void main (String[] args) {
        new ManagerPane();
    }
    
    public ManagerPane () {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800,600);
        
        window.setVisible(true);
        
    }
    
}
