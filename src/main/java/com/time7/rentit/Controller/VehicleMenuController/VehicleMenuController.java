package com.time7.rentit.Controller.VehicleMenuController;

import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Panes.Prompts.Prompts;
import com.time7.rentit.Service.VehicleService;
import java.awt.Component;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleMenuController {

    Component root;

    public VehicleMenuController(Component root) {
        this.root = root;
    }
    
    public void fillRow(JTable table) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        try {
            List<Vehicle> vehicles = VehicleService.getInstance().getVehicles();
            
            Object[] row = new Object[7];
            
            for (int i = 0; i<vehicles.size(); i++) {
                row[0] = vehicles.get(i).getId();
                row[1] = vehicles.get(i).getVehicleBrand();
                row[2] = vehicles.get(i).getVehicleModel();
                row[3] = vehicles.get(i).getVehicleYear();
                row[4] = vehicles.get(i).getVehiclePlate();
                row[5] = vehicles.get(i).getType();
                row[6] = vehicles.get(i).isStatus();

                model.addRow(row);
            }
            
        } catch (Exception e) {
            Prompts.PromptError(null, e);
        }
    }
}
