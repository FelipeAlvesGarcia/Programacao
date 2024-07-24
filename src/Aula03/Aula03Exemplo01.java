package Aula03;

import java.text.DecimalFormat;

public class Aula03Exemplo01 {
    public static void main(String[] args){
        double num = 23421542.23;
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        System.out.println("O valor "+df.format(num));
        System.out.println("O valor "+String.format("R$ %.2f", num));
    }
}
