
package com.time7.rentit.Panes.VehiclePane;

import com.time7.rentit.Controller.VehicleTableController.VehicleTableController;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Models.VehicleTable.VehicleTableModel;
import com.time7.rentit.Panes.ClientPane.ClientTablePane;
import com.time7.rentit.Prompts.Prompts;

/**
 *
 * @author Daniel
 */
public class VehicleTablePane
    extends 
        javax.swing.JPanel {

    private final VehicleTableModel vehicleTableModel;
    private final VehicleTableController controller;
    
    public VehicleTablePane() {
        initComponents();
        
        this.vehicleTableModel = new VehicleTableModel();
        this.jTable.setModel(vehicleTableModel);
        this.controller = new VehicleTableController(null);
        
        setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        removeButton = new javax.swing.JButton();
        rentButton = new javax.swing.JButton();
        addButon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editButtton = new javax.swing.JButton();

        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("Devolver");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnVehicleButton(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 129, 239));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remover");
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeVehicleButton(evt);
            }
        });

        rentButton.setForeground(new java.awt.Color(255, 255, 255));
        rentButton.setText("Alugar");
        rentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentVehicleButton(evt);
            }
        });

        addButon.setForeground(new java.awt.Color(255, 255, 255));
        addButon.setText("Adicionar");
        addButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addVehicleButton(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controles");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ações");

        editButtton.setForeground(new java.awt.Color(255, 255, 255));
        editButtton.setText("Editar");
        editButtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editVehicleButton(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addComponent(addButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rentButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButtton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeVehicleButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButton
        int selectedRow = this.jTable.getSelectedRow();
        Long vehicleId = (Long) this.jTable.getValueAt(selectedRow, vehicleTableModel.getColumnCount()-1);

        controller.removeVehicle(vehicleId, (Object object) -> {
            vehicleTableModel.removeVehicle(selectedRow);
        });
    }//GEN-LAST:event_removeVehicleButton

    private void addVehicleButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton
        controller.addVehicle((Object object) -> {
            vehicleTableModel.insertVehicle(Vehicle.class.cast(object));
        });
    }//GEN-LAST:event_addVehicleButton

    private void editVehicleButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editVehicleButton
        int selectedRow = this.jTable.getSelectedRow();
        Vehicle vehicle = vehicleTableModel.getVehicle(selectedRow);

        controller.editVehicle(vehicle, (Object object) -> {
            vehicleTableModel.editVehicle(selectedRow, Vehicle.class.cast(object));
        });
    }//GEN-LAST:event_editVehicleButton

    private void rentVehicleButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentVehicleButton
        // TODO add your handling code here:
    }//GEN-LAST:event_rentVehicleButton

    private void ReturnVehicleButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnVehicleButton
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnVehicleButton


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButon;
    private javax.swing.JButton editButtton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton rentButton;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
