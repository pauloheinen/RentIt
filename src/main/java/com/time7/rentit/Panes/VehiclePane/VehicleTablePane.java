package com.time7.rentit.Panes.VehiclePane;

import com.time7.rentit.Controller.VehicleTableController.VehicleTableController;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Models.VehicleTable.VehicleTableModel;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Utilities.GenericObserver;

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
        reportButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        rentButton = new javax.swing.JButton();
        addButon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editButtton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(880, 488));
        setMinimumSize(new java.awt.Dimension(880, 488));

        returnButton.setBackground(new java.awt.Color(69, 73, 74));
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("Devolver");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
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

        reportButton.setBackground(new java.awt.Color(69, 73, 74));
        reportButton.setForeground(new java.awt.Color(255, 255, 255));
        reportButton.setText("Relatório");

        removeButton.setBackground(new java.awt.Color(69, 73, 74));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remover");
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonremoveVehicleButton(evt);
            }
        });

        rentButton.setBackground(new java.awt.Color(69, 73, 74));
        rentButton.setForeground(new java.awt.Color(255, 255, 255));
        rentButton.setText("Alugar");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
            }
        });

        addButon.setBackground(new java.awt.Color(69, 73, 74));
        addButon.setForeground(new java.awt.Color(255, 255, 255));
        addButon.setText("Adicionar");
        addButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButonaddVehicleButton(evt);
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

        editButtton.setBackground(new java.awt.Color(69, 73, 74));
        editButtton.setForeground(new java.awt.Color(255, 255, 255));
        editButtton.setText("Editar");
        editButtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButttoneditVehicleButton(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reportButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButtton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reportButton)
                        .addGap(0, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        int selectedRow = getSelectedRow();

        if (selectedRow == -1) {
            Prompts.promptWarning(this, "Selecione uma linha");
            return;
        }
        System.out.println("Abre tela devolver");
    }//GEN-LAST:event_returnButtonActionPerformed

    private void removeButtonremoveVehicleButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonremoveVehicleButton
        int selectedRow = getSelectedRow();
        Long vehicleId = (Long) this.jTable.getValueAt(selectedRow, vehicleTableModel.getColumnCount()-1);

        controller.removeVehicle(vehicleId, (Object object) -> {
            vehicleTableModel.removeVehicle(selectedRow);
        });
    }//GEN-LAST:event_removeButtonremoveVehicleButton

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        int selectedRow = getSelectedRow();
                
        if (! hasSelectedRow()) {
            Prompts.promptWarning(this, "Selecione um veículo");
            return;
        }
        
        Vehicle vehicle = vehicleTableModel.getVehicle(selectedRow);

        if (vehicle.getStatus() == Vehicle.STATUS_RENT) {
            Prompts.promptWarning(this, "Este veículo já está alugado");
            return;
        }
        
        controller.rentVehicle(vehicle, new GenericObserver() {
            @Override
            public void inform(Object object) {
                // just do the connection with database to rent the vehicle
            }
        });
    }//GEN-LAST:event_rentButtonActionPerformed

    private void addButonaddVehicleButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButonaddVehicleButton
        controller.addVehicle((Object object) -> {
            vehicleTableModel.insertVehicle(Vehicle.class.cast(object));
        });
    }//GEN-LAST:event_addButonaddVehicleButton

    private void editButttoneditVehicleButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButttoneditVehicleButton
        int selectedRow = getSelectedRow();
        Vehicle vehicle = vehicleTableModel.getVehicle(selectedRow);

        controller.editVehicle(vehicle, (Object object) -> {
            vehicleTableModel.editVehicle(selectedRow, Vehicle.class.cast(object));
        });
    }//GEN-LAST:event_editButttoneditVehicleButton

    private boolean hasSelectedRow() {
        return getSelectedRow() == 0;
    }
    
    private int getSelectedRow() {
        return this.jTable.getSelectedRow();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButon;
    private javax.swing.JButton editButtton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton rentButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
