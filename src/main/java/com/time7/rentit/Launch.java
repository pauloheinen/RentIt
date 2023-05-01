package com.time7.rentit;

import com.time7.rentit.Panes.LoginPane;
import com.time7.rentit.Panes.RentItWindow;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Henrique
 */
public class Launch {
    
    static Connection conexao = null;
    
    public static void main( String[] args ) {
                
        if (getConnection()){
            // java.awt.EventQueue.invokeLater( () -> {
                //new RentItWindow().setVisible(true);
            //});
            new LoginPane().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados", "Erro", 0);
        }
    }
    
    private static boolean getConnection() {
        try {
            String dbdriver = "com.mysql.jdbc.Driver";
            String dburl = "jdbc:mysql://localhost/rentitdb";
            String dbuser = "root";
            String dbsenha = "280519";

            // Carrega Driver do Banco de Dados
            Class.forName(dbdriver);

            if (dbuser.length() != 0) // conexão COM usuário e senha
            {
                conexao = DriverManager.getConnection(dburl, dbuser, dbsenha);
            } else // conexão SEM usuário e senha
            {
                conexao = DriverManager.getConnection(dburl);
            }

            return true;

        } catch (Exception e) {
            System.err.println("Erro ao tentar conectar: " + e);
            return false;
        }
    }
}
