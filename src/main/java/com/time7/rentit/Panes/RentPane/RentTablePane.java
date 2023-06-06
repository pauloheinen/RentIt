package com.time7.rentit.Panes.RentPane;

import com.time7.rentit.Controller.RentTableController.RentTableController;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Models.RentTable.RentTableModel;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Report.Rent.RentReport;

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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        rentButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        returnRentButtton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 129, 239));
        setFocusable(false);
        setMaximumSize(null);
        setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 129, 239));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ações");
        jLabel2.setMaximumSize(new java.awt.Dimension(161, 48));
        jLabel2.setMinimumSize(new java.awt.Dimension(161, 48));
        jLabel2.setPreferredSize(new java.awt.Dimension(161, 48));

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
        jTable.setPreferredSize(null);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        rentButton.setBackground(new java.awt.Color(0, 129, 239));
        rentButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rentButton.setForeground(new java.awt.Color(255, 255, 255));
        rentButton.setText("Alugar");
        rentButton.setBorder(null);
        rentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentVehicleAction(evt);
            }
        });

        reportButton.setBackground(new java.awt.Color(0, 129, 239));
        reportButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportButton.setForeground(new java.awt.Color(255, 255, 255));
        reportButton.setText("Relatório");
        reportButton.setBorder(null);
        reportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportButtonMouseClicked(evt);
            }
        });

        returnRentButtton.setBackground(new java.awt.Color(0, 129, 239));
        returnRentButtton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        returnRentButtton.setForeground(new java.awt.Color(255, 255, 255));
        returnRentButtton.setText("Devolver");
        returnRentButtton.setBorder(null);
        returnRentButtton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnRentButtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnRentAction(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sem título.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(rentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(returnRentButtton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(rentButton)
                        .addGap(18, 18, 18)
                        .addComponent(returnRentButtton)
                        .addGap(18, 18, 18)
                        .addComponent(reportButton)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void rentVehicleAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentVehicleAction
        controller.rentVehicle((Object object) -> {
            rentTableModel.insertRent(Rent.class.cast(object));
        });
    }//GEN-LAST:event_rentVehicleAction

    private void returnRentAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnRentAction
        if (! isRowSelected()) {
            Prompts.promptWarning(this, "Necessário selecionar uma locação!");
            return;
        }
                
        int selectedRow = getSelectedRow();
        
        Rent rent = rentTableModel.getRent(selectedRow);
        
        if (rent.getStatus() == Rent.STATUS_CLOSED) {
            Prompts.promptWarning(this, "Locação selecionada já está encerrada!");
            return;
        } else {
            controller.returnRent(rent, (Object object) -> {
                rentTableModel.returnRent(selectedRow, Rent.class.cast(object));
            });
        }    
    }//GEN-LAST:event_returnRentAction

    private void reportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseClicked
        try {
            RentReport.generateReport();
        } catch (Exception e) {
            Prompts.promptError(this, e);
        }
    }//GEN-LAST:event_reportButtonMouseClicked

    private int getSelectedRow() {
        return this.jTable.getSelectedRow();
    }
    
    private boolean isRowSelected() {
        return getSelectedRow() > -1;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton rentButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton returnRentButtton;
    // End of variables declaration//GEN-END:variables
}
