package com.time7.rentit.Prompts;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Henrique
 */
public class Prompts {
    
    public static void promptInfo(Component root, String message) {
        JOptionPane.showMessageDialog(root, message, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void promptWarning(Component root, String message) {
        JOptionPane.showMessageDialog(root, message, "Atenção", JOptionPane.WARNING_MESSAGE);
    }
    
    public static int promptQuestion(Component root, String message) {
        int option = JOptionPane.showConfirmDialog(root, message, "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return option;
    }
    
    public static void promptError(Component root, Exception exception) {
        PromptError.showErrorDialog(root, exception, "Erro");
    }
}
