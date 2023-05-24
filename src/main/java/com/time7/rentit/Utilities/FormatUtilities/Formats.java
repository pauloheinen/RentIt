package com.time7.rentit.Utilities.FormatUtilities;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Daniel
 */
public class Formats {
    static DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

    public static String getFormat(String format) {
        
        MaskFormatter maskFormatter = new MaskFormatter();

        maskFormatter.setPlaceholderCharacter(' ');
        maskFormatter.setValueContainsLiteralCharacters(false);

        try {
            maskFormatter.setMask(format);
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return format;
    }

    public static void formatDecimal(JTextField field) {
        field.setText(df.format(Double.parseDouble(field.getText())));
    }

    public static String formatDecimal(double value) {
        NumberFormat formatter = new DecimalFormat("###0.00");
        return (formatter.format(value));
    }

    public static String getTelephone() {
        return getFormat("(##) #####-####");
    }

    public static String getCNPJ() {
        return getFormat("##.###.###/####-##");
    }

    public static String getCPF() {
        return getFormat("###.###.###-##");
    }

    public static String getDate() {
        return getFormat("##/##/####");
    }

    public static String getDateTime() {
        return getFormat("##/##/#### ##:##");
    }

    public void formatterDecimal(JTextField field) {
        field.setText(df.format(Double.parseDouble(field.getText())));
    }

    public static void formatDate(JFormattedTextField field) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("##/##/####");
            field.setFormatterFactory(null);
            field.setFormatterFactory(new DefaultFormatterFactory(m));
            field.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
     public static void formatDateTime(JFormattedTextField field) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("##/##/#### ##:##");
            field.setFormatterFactory(null);
            field.setFormatterFactory(new DefaultFormatterFactory(m));
            field.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void formatCpf(JFormattedTextField field) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("###.###.###-##");
            field.setFormatterFactory(null);
            field.setFormatterFactory(new DefaultFormatterFactory(m));
            field.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void formatCnpj(JFormattedTextField field) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("##.###.###/####-##");
            field.setFormatterFactory(null);
            field.setFormatterFactory(new DefaultFormatterFactory(m));
            field.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void formatTelephone(JFormattedTextField field) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("(##) # ####-####");
            field.setFormatterFactory(null);
            field.setFormatterFactory(new DefaultFormatterFactory(m));
            field.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static String adjustDateDMA(String date) {
        String formattedDate = null;
        try {
            Date dateAMD = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            formattedDate = new SimpleDateFormat("dd/MM/yyyy").format(dateAMD);
        } catch (Exception e) {
            System.err.println(e);
        }
        return (formattedDate);
    }

    public static String adjustDateAMD(String date) {
        String formattedDate = null;
        try {
            Date dataDMA = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(dataDMA);
        } catch (Exception e) {
            System.err.println(e);
        }
        return (formattedDate);
    }

    public static String removeFormat(String info) {
        String retorno = "";
        for (int i = 0; i < info.length(); i++) {
            if (info.charAt(i) != '.' && info.charAt(i) != '/' && info.charAt(i) != '-') {
                retorno = retorno + info.charAt(i);
            }
        }
        return (retorno);
    }

    public static String getCurrentDate() {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = df.format(now);

        return currentDate;
    }

    public static String getCurrentDateTime() {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String currentDate = df.format(now);

        return currentDate;
    }
}
