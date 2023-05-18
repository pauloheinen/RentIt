package com.time7.rentit.Panes;

import com.time7.rentit.Panes.ClientPane.ClientTablePane;
import com.time7.rentit.Panes.ClientPane.ClientsJPanel;
import com.time7.rentit.Panes.VehiclePane.VehiclesJPanel;
import com.time7.rentit.Panes.VehiclePane.VehicleTablePane;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

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
        window.setSize(900,400);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        tabbedPane.add("Veículos", new VehiclesJPanel());
        tabbedPane.add("Clientes", new ClientsJPanel());;
        //tabbedPane.add("Veículos", new VehicleTablePane());
        
        window.add(tabbedPane);
        
        window.setVisible(true);
        
    }
    
}
