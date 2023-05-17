package com.time7.rentit.Panes.VehiclePane;

import com.time7.rentit.Controller.VehicleTableController.VehicleTableController;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Models.VehicleTable.VehicleTableModel;
import com.time7.rentit.Panes.ClientPane.ClientTablePane;
import com.time7.rentit.Panes.Prompts.Prompts;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleTablePane
    extends 
        javax.swing.JFrame {

    private final VehicleTableModel vehicleTableModel;
    private final VehicleTableController controller;
    
    public VehicleTablePane() {
        initComponents();
        
        this.vehicleTableModel = new VehicleTableModel();
        this.jTable.setModel(vehicleTableModel);
        this.controller = new VehicleTableController(this);
        this.setTitle("Listagem de veículos");
        
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        reportButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        rentButton = new javax.swing.JButton();
        addButon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editButtton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        reportButton.setText("Relatório");

        removeButton.setText("Remover");
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeVehicleButton(evt);
            }
        });

        rentButton.setText("Alugar");
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
            }
        });

        addButon.setText("Adicionar");
        addButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addVehicleButton(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controles");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ações");

        editButtton.setText("Editar");
        editButtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editVehicleButton(evt);
            }
        });

        returnButton.setText("Devolver");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(addButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(rentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButtton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(returnButton)
                        .addGap(12, 12, 12)
                        .addComponent(reportButton)))
                .addContainerGap())
        );

        pack();
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

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        int selectedRow = this.jTable.getSelectedRow();
        
        if (selectedRow == -1) {
            
            String message = "Selecione uma linha.";
            Prompts.promptWarning(this, message);
            
        } else {
            System.out.println("Abre tela devolver");
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        
        int selectedRow = this.jTable.getSelectedRow();
                
        if (selectedRow == -1) {
            
            String message = "Selecione uma linha.";
            Prompts.promptWarning(this, message);
            
        } else {
            
            Vehicle vehicle = vehicleTableModel.getVehicle(selectedRow);
            boolean statusVehicle = vehicle.isStatus();
            if (statusVehicle == false) {
            
            String message = "Este veículo já está alugado.";
            Prompts.promptWarning(this, message);
            
        } else {
            try {
                ClientTablePane clientTablePane = new ClientTablePane();
                clientTablePane.setVisible(true);
                
                
                
            } catch (Exception e) {
                Prompts.promptError(this, e);
            }
        } 
        }
    }//GEN-LAST:event_rentButtonActionPerformed

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
