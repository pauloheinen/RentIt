package com.time7.rentit.Panes.ClientPane;

import com.time7.rentit.Controller.ClientTableController.ClientTableController;
import com.time7.rentit.Entity.Client;
import com.time7.rentit.Models.ClientTable.ClientTableModel;
import com.time7.rentit.Prompts.Prompts;

/**
 *
 * @author Daniel
 */
public class ClientTablePane 
    extends
        javax.swing.JPanel {

    private final ClientTableModel clientTableModel;
    private final ClientTableController controller;

    public ClientTablePane() {
        initComponents();

        this.clientTableModel = new ClientTableModel();
        this.jTable.setModel(clientTableModel);
        this.controller = new ClientTableController(null);
        
        setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addButon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        addButon.setText("Adicionar");
        addButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButon(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controles");

        editButton.setText("Editar");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButton(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(addButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButon(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButon
        controller.addClient((Object object) -> {
            clientTableModel.insertClient(Client.class.cast(object));
        });
    }//GEN-LAST:event_addButon

    private void editButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButton
        int selectedRow = getSelectedRow();
        
        if (selectedRow < 0) {
            Prompts.promptWarning(this, "Necessário selecionar um cliente");
            return;
        } else {
            Client client = clientTableModel.getClient(selectedRow);

            controller.editClient(client, (Object object) -> {
                clientTableModel.editClient(selectedRow, Client.class.cast(object));
            });
        }    
    }//GEN-LAST:event_editButton

    private int getSelectedRow() {
        return this.jTable.getSelectedRow();
    }
    
    private boolean isRowSelected() {
        return getSelectedRow() == 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButon;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
