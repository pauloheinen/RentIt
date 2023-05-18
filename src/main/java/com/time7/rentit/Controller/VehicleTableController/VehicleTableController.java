package com.time7.rentit.Controller.VehicleTableController;

import com.time7.rentit.Editors.VehicleTableEditor.VehicleCellEditor;
import com.time7.rentit.Entity.Vehicle;
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
                
                Prompts.PromptInfo(root, "Veículo adicionado!");
                
                callback.inform(vehicle);
            } catch (Exception e) {
                Prompts.PromptError(root, e);
            }
        }).addVehicle();
    }

    public void removeVehicle(Long vehicleId, GenericObserver callback) {
        VehicleService service = VehicleService.getInstance();        
        
        try {
            Vehicle vehicle = service.getVehicleById(vehicleId);
            service.deleteVehicle(vehicle);
            
            Prompts.PromptInfo(root, "Veículo removido");
            
            callback.inform(vehicle);
        } catch (Exception e) {
            Prompts.PromptError(root, e);
        }
    }
    
    public void editVehicle(Vehicle vehicle, GenericObserver callback) {
        new VehicleCellEditor(root, (Object object) -> {
            VehicleService service = VehicleService.getInstance();
        
            try {
                Vehicle v = Vehicle.class.cast(object);
                service.updateVehicle(v);
                
                Prompts.PromptInfo(root, "Veículo atualizado");
                
                callback.inform(v);
            } catch (Exception e) {
                Prompts.PromptError(root, e);
            }
        }).editVehicle(vehicle);
    }
}
