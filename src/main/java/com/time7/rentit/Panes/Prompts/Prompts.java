package com.time7.rentit.Panes.Prompts;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo Henrique
 */
public class Prompts {
    
    public static void PromptInfo(Component root, String message) {
        JOptionPane.showMessageDialog(root, message, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void PromptWarning(Component root, String message) {
        JOptionPane.showMessageDialog(root, message, "Atenção", JOptionPane.WARNING_MESSAGE);
    }
    
    public static int PromptQuestion(Component root, String message) {
        int option = JOptionPane.showConfirmDialog(root, message, "Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return option;
    }
    
    public static void PromptError(Component root, Exception exception) {
        PromptError.showErrorDialog(root, exception, "Erro");
    }
}
