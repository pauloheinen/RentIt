package com.time7.rentit.Panes.Toast;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JOptionPane;

/**
 *
 @author Paulo Henrique
 */
public class ToastInfo
    extends
        javax.swing.JFrame {
    
    public ToastInfo() {
//        Notification not = new Notification(this, Notification.Type.INFO, Notification.Location.BOTTOM_LEFT, "Test message");
//        not.showNotification();
        // being implemented
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater( new Runnable() {
          public void run() {
              new ToastInfo().setVisible(true);
          }  
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCopy = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaError = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCopy.setForeground(new java.awt.Color(102, 102, 102));
        jButtonCopy.setText("Copiar");
        jButtonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyActionPerformed(evt);
            }
        });

        jButtonExit.setForeground(new java.awt.Color(102, 102, 102));
        jButtonExit.setText("Fechar");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Ocorreu um erro inesperado...");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Veja o erro abaixo:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextAreaError.setEditable(false);
        jTextAreaError.setColumns(20);
        jTextAreaError.setRows(5);
        jScrollPane1.setViewportView(jTextAreaError);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jButtonCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Deseja fechar a janela?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyActionPerformed
        
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection (jTextAreaError.getText());
        clip.setContents (ss, ss);   
    }//GEN-LAST:event_jButtonCopyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCopy;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaError;
    // End of variables declaration//GEN-END:variables
}
