package com.time7.rentit.Utilities.Validations;

import javax.swing.JFormattedTextField;

/**
 *
 * @author Daniel
 */
public class Validations {

    private static final int[] weightCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    private static final int[] weightCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int digitCalculate(String str, int[] weight) {
        int sum = 0;
        for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
            digito = Integer.parseInt(str.substring(indice, indice + 1));
            sum += digito * weight[weight.length - str.length() + indice];
        }
        sum = 11 - sum % 11;
        return sum > 9 ? 0 : sum;
    }

    public static boolean validateCPF(String cpf) {
        if ((cpf == null) || (cpf.length() != 11)) {
            return false;
        }
        Integer digit1 = digitCalculate(cpf.substring(0, 9), weightCPF);
        Integer digit2 = digitCalculate(cpf.substring(0, 9) + digit1, weightCPF);
        return cpf.equals(cpf.substring(0, 9) + digit1.toString() + digit2.toString());
    }

    public static boolean validateCNPJ(String cnpj) {
        if ((cnpj == null) || (cnpj.length() != 14)) {
            return false;
        }
        Integer digito1 = digitCalculate(cnpj.substring(0, 12), weightCNPJ);
        Integer digito2 = digitCalculate(cnpj.substring(0, 12) + digito1, weightCNPJ);
        return cnpj.equals(cnpj.substring(0, 12) + digito1.toString() + digito2.toString());
    }

    public static boolean validateDateDMA (int d, int m, int a) {
        
        boolean correct = true;
        
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (a < 0 || m < 1 || m > 12) {
            correct = false;
        } else {
            // valida o dia
            if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
                dias[1] = 29;
            }
            if (d < 1 || d > dias[m - 1]) {
                correct = false;
            }
        }
        return (correct);
    }

    public static boolean validarDataFormatada (String dataComFormato) {
        String[] data = dataComFormato.split("/");
        return (validateDateDMA(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])));
    }

    public static boolean validateTelephone(JFormattedTextField campo) {
        if (campo.getText().trim().length() < 15) {
            return false;
        } else {
            return true;
        }
    }
}