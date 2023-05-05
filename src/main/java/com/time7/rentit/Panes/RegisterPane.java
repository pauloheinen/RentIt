package com.time7.rentit.Panes;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author José Augusto Scherer
 */
public class RegisterPane 
    extends 
        javax.swing.JFrame {

    
    public RegisterPane() {
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

        registerContent = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextFieldOne = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        passwordTextFieldTwo = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerContent.setBackground(new java.awt.Color(0, 0, 0));

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\José Augusto Scherer\\Desktop\\RentIt\\src\\main\\java\\com\\time7\\rentit\\Images\\logo2.png")); // NOI18N

        nameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 0));
        nameLabel.setText("Nome");

        nameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 0));
        userNameLabel.setText("Nome de Usuário");

        userNameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        passwordLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 0));
        passwordLabel.setText("Senha");

        passwordTextFieldOne.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Confirmação de senha");

        passwordTextFieldTwo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordTextFieldTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldTwoActionPerformed(evt);
            }
        });

        registerButton.setText("Registrar");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("Voltar");
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerContentLayout = new javax.swing.GroupLayout(registerContent);
        registerContent.setLayout(registerContentLayout);
        registerContentLayout.setHorizontalGroup(
            registerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(191, 191, 191))
            .addGroup(registerContentLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(registerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(goBackButton)
                    .addGroup(registerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(passwordLabel)
                        .addComponent(userNameLabel)
                        .addComponent(nameLabel)
                        .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameTextField)
                        .addComponent(userNameTextField)
                        .addComponent(passwordTextFieldOne)
                        .addComponent(passwordTextFieldTwo)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        registerContentLayout.setVerticalGroup(
            registerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextFieldOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextFieldTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(registerButton)
                .addGap(18, 18, 18)
                .addComponent(goBackButton)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldTwoActionPerformed
        
    }//GEN-LAST:event_passwordTextFieldTwoActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        close();
        
        LoginPane loginPane = new LoginPane();
        loginPane.setVisible( true );
        
        setDefaultCloseOperation( javax.swing.WindowConstants.DISPOSE_ON_CLOSE );
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        JOptionPane.showMessageDialog( null, "Working on it..." );
    }//GEN-LAST:event_registerButtonActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextFieldOne;
    private javax.swing.JPasswordField passwordTextFieldTwo;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerContent;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
