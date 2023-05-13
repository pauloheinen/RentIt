package com.time7.rentit.Editors.VehicleTableEditor;

import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Utilities.GenericObserver;
import java.awt.Component;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleCellEditor
    extends 
        javax.swing.JFrame {
    
    private final GenericObserver callback;
    private Vehicle source;
    
    public VehicleCellEditor(Component root, GenericObserver callback) {
        this.callback = callback;
        
        initComponents();
        
        setLocationRelativeTo(root);
    }

    public void showPane() {
        setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brandTextEditor = new javax.swing.JTextField();
        modelTextEditor = new javax.swing.JTextField();
        plateTextEditor = new javax.swing.JTextField();
        yearTextEditor = new javax.swing.JTextField();
        statusTextEditor = new javax.swing.JTextField();
        typeTextEditor = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editor de Células");
        setMinimumSize(new java.awt.Dimension(468, 34));
        setName("vehicleEditorFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        brandTextEditor.setText("Marca");

        modelTextEditor.setText("Modelo");

        plateTextEditor.setText("Placa");

        yearTextEditor.setText("Ano");

        statusTextEditor.setText("Status");

        typeTextEditor.setText("Tipo");

        confirmButton.setText("Confirmar");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmAction(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelAction(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(brandTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modelTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plateTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plateTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cancelAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelAction
        this.dispose();
    }//GEN-LAST:event_cancelAction

    private void confirmAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmAction
        Vehicle vehicle;
        
        if (source != null) {
            vehicle = source;
            vehicle.setId(source.getId());
        }
        else {
            vehicle = new Vehicle();
        }
         
        vehicle.setVehicleBrand(brandTextEditor.getText());
        vehicle.setVehicleModel(modelTextEditor.getText());
        vehicle.setVehicleYear(yearTextEditor.getText());
        vehicle.setVehiclePlate(plateTextEditor.getText());
        vehicle.setType(Integer.valueOf(typeTextEditor.getText()));
        vehicle.setStatus(Boolean.valueOf(statusTextEditor.getText()));
        
        callback.inform(vehicle);
        dispose();
    }//GEN-LAST:event_confirmAction

    public void editVehicle(Vehicle vehicle) {
        source = vehicle;
        
        brandTextEditor.setText(source.getVehicleBrand());
        modelTextEditor.setText(source.getVehicleModel());
        yearTextEditor.setText(source.getVehicleYear());
        plateTextEditor.setText(source.getVehiclePlate());
        typeTextEditor.setText(String.valueOf(source.getType()));
        statusTextEditor.setText(String.valueOf(source.isStatus()));
        
        showPane();
    }
    
    public void addVehicle() {
        showPane();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brandTextEditor;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField modelTextEditor;
    private javax.swing.JTextField plateTextEditor;
    private javax.swing.JTextField statusTextEditor;
    private javax.swing.JTextField typeTextEditor;
    private javax.swing.JTextField yearTextEditor;
    // End of variables declaration//GEN-END:variables
}
