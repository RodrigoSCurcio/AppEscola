package br.com.kasolution.util;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formata {
    
    public static String formata(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(valor);
    }
    
    public static String formata(LocalDateTime ldt) {
        DateTimeFormatter dtf =
                      DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm:ss - a");
        return dtf.format(ldt);
    }    
}
