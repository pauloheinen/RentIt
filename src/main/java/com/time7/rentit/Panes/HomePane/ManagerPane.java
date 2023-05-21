package com.time7.rentit.Panes.HomePane;

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
    extends
        JFrame {
    
    private final JTabbedPane tabbedPane = new JTabbedPane();
    private final VehicleTablePane vehicleTablePane;
    private final ClientTablePane clientTablePane;
    private final RentTablePane rentTablePane;
    
    public ManagerPane(JFrame root) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 400);
        this.setLocationRelativeTo(root);
        
        vehicleTablePane = new VehicleTablePane();
        clientTablePane = new ClientTablePane();
        rentTablePane = new RentTablePane();
        
        tabbedPane.add("Veículos", vehicleTablePane);
        tabbedPane.add("Clientes", clientTablePane);
        tabbedPane.add("Locações", rentTablePane);
                
        this.add(tabbedPane);
    }
}
