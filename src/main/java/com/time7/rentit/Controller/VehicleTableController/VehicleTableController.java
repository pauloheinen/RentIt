package com.time7.rentit.Controller.VehicleTableController;

import com.time7.rentit.Editors.VehicleTableEditor.VehicleCellEditor;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Models.VehicleTable.VehicleTableModel;
import com.time7.rentit.Panes.Prompts.Prompts;
import com.time7.rentit.Service.VehicleService;
import com.time7.rentit.Utilities.GenericObserver;
import javax.swing.JFrame;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleTableController {

    private final JFrame root;
    
    public VehicleTableController(JFrame root) {
        this.root = root;
    }
    
    public void addVehicle(GenericObserver callback) {
        new VehicleCellEditor(root, (Object object) -> {
            VehicleService service = VehicleService.getInstance();
        
            try {
                Vehicle vehicle = Vehicle.class.cast(object);
                service.createVehicle(vehicle);
                
                // prompt something to inform that the vehicle has been added
                
                callback.inform(vehicle);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).addVehicle();
    }

    public void removeVehicle(Long vehicleId, GenericObserver callback) {
        VehicleService service = VehicleService.getInstance();        
        
        try {
            Vehicle vehicle = service.getVehicleById(vehicleId);
            service.deleteVehicle(vehicle);
            
            // prompt something to inform that the vehicle has been removed
            
            callback.inform(vehicle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void editVehicle(Vehicle vehicle, GenericObserver callback) {
        new VehicleCellEditor(root, (Object object) -> {
            VehicleService service = VehicleService.getInstance();
        
            try {
                Vehicle v = Vehicle.class.cast(object);
                service.updateVehicle(v);
                
                // prompt something to inform that the vehicle has been edited
                
                callback.inform(v);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).editVehicle(vehicle);
    }
    
    public boolean validateRowSelected(int selectedRow) {
        if (selectedRow == -1) {
            String message = "Selecione uma linha.";
            Prompts.PromptWarning(root, message);
            return false;
        } else {
            return true;
        }
    }
}