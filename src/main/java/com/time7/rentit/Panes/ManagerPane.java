package com.time7.rentit.Panes;

import com.time7.rentit.Panes.ClientPane.ClientTablePane;
import com.time7.rentit.Panes.RentPane.RentTablePane;
import com.time7.rentit.Panes.VehiclePane.VehicleTablePane;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author Daniel
 */
public class ManagerPane
    extends JFrame {
    
    public ManagerPane () {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,400);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        tabbedPane.add("Veículos", new VehicleTablePane());
        tabbedPane.add("Clientes", new ClientTablePane());
        tabbedPane.add("Locações", new RentTablePane());
        
        this.add(tabbedPane);   
    }    
}