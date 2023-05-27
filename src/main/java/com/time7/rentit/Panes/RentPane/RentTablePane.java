package com.time7.rentit.Panes.RentPane;

import com.time7.rentit.Controller.RentTableController.RentTableController;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Models.RentTable.RentTableModel;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Vehicle.VehicleService;
import com.time7.rentit.Utilities.GenericObserver;

/**
 *
 * @author Paulo Henrique
 */
public class RentTablePane
    extends 
        javax.swing.JPanel {
    
    private final RentTableModel rentTableModel;
    private final RentTableController controller;

    public RentTablePane() {
        initComponents();

        this.rentTableModel = new RentTableModel();
        this.jTable.setModel(rentTableModel);
        this.controller = new RentTableController(null);
        
        setVisible(true);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        rentButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        rentReturn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1044, 339));
        setMinimumSize(new java.awt.Dimension(1044, 339));
        setPreferredSize(new java.awt.Dimension(1044, 339));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ações");

        jScrollPane1.setBackground(new java.awt.Color(0, 129, 239));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        jTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable.setPreferredSize(new java.awt.Dimension(831, 327));
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        rentButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rentButton.setForeground(new java.awt.Color(255, 255, 255));
        rentButton.setText("Alugar");
        rentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentVehicleAction(evt);
            }
        });
        rentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentButtonActionPerformed(evt);
            }
        });

        reportButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        reportButton.setForeground(new java.awt.Color(255, 255, 255));
        reportButton.setText("Relatório");

        rentReturn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rentReturn.setForeground(new java.awt.Color(255, 255, 255));
        rentReturn.setText("Devolver");
        rentReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentReturnrentVehicleAction(evt);
            }
        });
        rentReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rentReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportButton)
                .addGap(18, 18, 18)
                .addComponent(rentButton)
                .addGap(18, 18, 18)
                .addComponent(rentReturn)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rentVehicleAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentVehicleAction
        controller.rentVehicle(new GenericObserver() {
            @Override
            public void inform(Object object) {
                rentTableModel.insertRent(Rent.class.cast(object));
            }
        });
    }//GEN-LAST:event_rentVehicleAction

    private void rentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentButtonActionPerformed

    private void rentReturnrentVehicleAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentReturnrentVehicleAction
        // TODO add your handling code here:
    }//GEN-LAST:event_rentReturnrentVehicleAction

    private void rentReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentReturnActionPerformed
        int selectedRow = getSelectedRow();
        
        if (selectedRow < 0) {
            Prompts.promptWarning(this, "Necessário selecionar uma locação");
            return;
        } else {
            try {
                Long vehicleId = (Long) this.jTable.getValueAt(selectedRow, 3);
                
                VehicleService vehicleService = VehicleService.getInstance();
                Vehicle vehicle = new Vehicle();
                vehicle = vehicleService.getVehicleById(vehicleId);
                
                if (vehicle.getStatus() == 0) {
                    Prompts.promptWarning(this, "Este veículo não está alugado. \nCódigo veículo: " + vehicle.getId() + "\nVeículo: " + vehicle.getVehicleModel());
                } else {
                    Rent rent = rentTableModel.getRent(selectedRow);
                    
                    controller.editRent(rent, (Object object) -> {
                        rentTableModel.editRent(selectedRow, Rent.class.cast(object));
                    });
                }
            } catch (Exception e) {
                Prompts.promptError(this, e);
            }
        }
    }//GEN-LAST:event_rentReturnActionPerformed

    private int getSelectedRow() {
        return this.jTable.getSelectedRow();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton rentButton;
    private javax.swing.JButton rentReturn;
    private javax.swing.JButton reportButton;
    // End of variables declaration//GEN-END:variables
}