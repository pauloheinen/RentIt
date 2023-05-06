package com.time7.rentit.Panes;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author José Augusto Scherer
 */
public class RegisterPane extends javax.swing.JFrame {

    
    public RegisterPane() {
        initComponents();
        
        // centraliza o JFrame
        this.setLocationRelativeTo(null);
    }
    // método 'close' para fechar o JFrame
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registerPaneContent = new javax.swing.JPanel();
        tittleLabel = new javax.swing.JLabel();
        registerIcon = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordTextField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        pencilIcon1 = new javax.swing.JLabel();
        pencilIcon2 = new javax.swing.JLabel();
        lockerIcon1 = new javax.swing.JLabel();
        lockerIcon2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerPaneContent.setBackground(new java.awt.Color(153, 153, 153));

        tittleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tittleLabel.setText("Registre-se");

        registerIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\José Augusto Scherer\\Desktop\\RentIt\\src\\main\\java\\com\\time7\\rentit\\Images\\register-32x32.png")); // NOI18N

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameLabel.setText("Nome");

        nameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setText("Nome de Usuário");

        userNameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLabel.setText("Senha");

        passwordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        confirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmPasswordLabel.setText("Confirme a Senha");

        confirmPasswordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        pencilIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\José Augusto Scherer\\Desktop\\RentIt\\src\\main\\java\\com\\time7\\rentit\\Images\\pencil-16x16.png")); // NOI18N

        pencilIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\José Augusto Scherer\\Desktop\\RentIt\\src\\main\\java\\com\\time7\\rentit\\Images\\pencil-16x16.png")); // NOI18N

        lockerIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\José Augusto Scherer\\Desktop\\RentIt\\src\\main\\java\\com\\time7\\rentit\\Images\\locker-16x16.png")); // NOI18N

        lockerIcon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\José Augusto Scherer\\Desktop\\RentIt\\src\\main\\java\\com\\time7\\rentit\\Images\\locker-16x16.png")); // NOI18N

        javax.swing.GroupLayout registerPaneContentLayout = new javax.swing.GroupLayout(registerPaneContent);
        registerPaneContent.setLayout(registerPaneContentLayout);
        registerPaneContentLayout.setHorizontalGroup(
            registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneContentLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goBackButton))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                .addComponent(userNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pencilIcon2))
                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lockerIcon1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneContentLayout.createSequentialGroup()
                                .addComponent(tittleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerIcon))
                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addGap(245, 245, 245)
                                .addComponent(pencilIcon1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nameTextField)
                            .addComponent(userNameTextField)
                            .addComponent(passwordTextField)
                            .addComponent(confirmPasswordTextField)
                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                .addComponent(confirmPasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lockerIcon2)))))
                .addContainerGap())
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(registerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPaneContentLayout.setVerticalGroup(
            registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tittleLabel))
                .addGap(26, 26, 26)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel)
                    .addComponent(pencilIcon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLabel)
                    .addComponent(pencilIcon2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel)
                    .addComponent(lockerIcon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmPasswordLabel)
                    .addComponent(lockerIcon2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPaneContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPaneContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // ação do botão 'Voltar'
    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        close();
        LoginPane loginPane = new LoginPane();
        loginPane.setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Work in progress.");
    }//GEN-LAST:event_registerButtonActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPane().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordTextField;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lockerIcon1;
    private javax.swing.JLabel lockerIcon2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel pencilIcon1;
    private javax.swing.JLabel pencilIcon2;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerIcon;
    private javax.swing.JPanel registerPaneContent;
    private javax.swing.JLabel tittleLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
