package com.time7.rentit.Controller.RentTableController;

import com.time7.rentit.Editors.RentEditor.RentCellEditor;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Rent.RentService;
import com.time7.rentit.Utilities.GenericObserver;
import javax.swing.JFrame;

/**
 *
 * @author Paulo Henrique
 */
public class RentTableController {
    
    private final JFrame root;
    
    public RentTableController(JFrame root) {
        this.root = root;
    }
    
    public void generateReport() {
        
    }
    
    public void rentVehicle(GenericObserver callback) {
        new RentCellEditor(root, (Object object) -> {
            RentService service = RentService.getInstance();
            
            try {
                Rent r = Rent.class.cast(object);
                service.createRent(r);
                
                Prompts.promptInfo(root, "Locação criada");
                
                callback.inform(r);
            } catch (Exception e) {
                Prompts.promptError(root, e);
            }
            
        }).rentVehicle();
    }
    
    public void editUpdateRent(Rent rent, GenericObserver callback) {
        new RentCellEditor(root, (Object object) -> {
            RentService service = RentService.getInstance();
        
            try {
                Rent r = Rent.class.cast(object);
                service.updateRent(r);
                
                Prompts.promptInfo(root, "Locação encerrada!");
                
                callback.inform(r);
            } catch (Exception e) {
                Prompts.promptError(root, e);
            }
        }).editRent(rent);
    }
}
