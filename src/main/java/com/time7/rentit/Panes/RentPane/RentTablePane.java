package com.time7.rentit.Panes.RentPane;

import com.time7.rentit.Controller.RentTableController.RentTableController;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Models.RentTable.RentTableModel;
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

        setMaximumSize(new java.awt.Dimension(880, 339));
        setMinimumSize(new java.awt.Dimension(880, 339));
        setPreferredSize(new java.awt.Dimension(880, 339));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ações");

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
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        rentButton.setForeground(new java.awt.Color(255, 255, 255));
        rentButton.setText("Alugar");
        rentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentVehicleAction(evt);
            }
        });

        reportButton.setBackground(new java.awt.Color(69, 73, 74));
        reportButton.setForeground(new java.awt.Color(255, 255, 255));
        reportButton.setText("Relatório");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(reportButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rentButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton rentButton;
    private javax.swing.JButton reportButton;
    // End of variables declaration//GEN-END:variables
}