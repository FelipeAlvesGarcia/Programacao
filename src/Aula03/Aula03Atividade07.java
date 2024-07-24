package Aula03;

import java.util.Scanner;

public class Aula03Atividade07 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double temperatura;
        char converter;
        
        System.out.print("Digite uma temperatura: ");
        temperatura = ler.nextFloat();
        System.out.println("\n(C) para converter Fahrenheit para Celsius");
        System.out.println("(F) para converter Celsius para Fahrenheit");
        converter = ler.next().toLowerCase().charAt(0);
        
        switch (converter){
            case 'f'->{
                temperatura = temperatura*1.8+32;
                System.out.println("\n"+temperatura+"°F");
            }
            case 'c'->{
                temperatura = (temperatura-32)/1.8;
                System.out.println("\n"+temperatura+"°C");
            }
        }
    }
}
