package com.time7.rentit.Panes;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author José Augusto Scherer
 */
public class LoginPane 
    extends 
        javax.swing.JFrame {

    public LoginPane() {
        initComponents();
        
        this.setLocationRelativeTo( null );
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
        Toolkit.getDefaultToolkit()
               .getSystemEventQueue()
               .postEvent( closeWindow );
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginContent = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        enterButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginContent.setBackground(new java.awt.Color(0, 0, 0));

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\José Augusto Scherer\\Desktop\\RentIt\\src\\main\\java\\com\\time7\\rentit\\Images\\logo1.png")); // NOI18N

        nameLabel.setBackground(new java.awt.Color(0, 0, 0));
        nameLabel.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 0));
        nameLabel.setText("Nome");

        nameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        passwordLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 0));
        passwordLabel.setText("Senha");

        enterButton.setText("Entrar");
        enterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        registerButton.setText("Registrar-se");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Esqueceu sua senha?");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginContentLayout = new javax.swing.GroupLayout(loginContent);
        loginContent.setLayout(loginContentLayout);
        loginContentLayout.setHorizontalGroup(
            loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginContentLayout.createSequentialGroup()
                .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginContentLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginContentLayout.createSequentialGroup()
                                .addComponent(enterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerButton))
                            .addComponent(passwordLabel)
                            .addComponent(nameLabel)
                            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTextField)
                            .addComponent(passwordTextField)))
                    .addGroup(loginContentLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        loginContentLayout.setVerticalGroup(
            loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginContentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(loginContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton)
                    .addComponent(registerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        close();
        RegisterPane registerPane = new RegisterPane();
        registerPane.setVisible( true );
        
        setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );
    }//GEN-LAST:event_registerButtonActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        JOptionPane.showMessageDialog( null, "Working on it..." );
    }//GEN-LAST:event_enterButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog( null, "Working on it..." );
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel loginContent;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
