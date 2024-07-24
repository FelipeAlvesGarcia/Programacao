package Aula02;

import java.util.Scanner;

public class Aula02Atividade04 {
    public static void main(String[] args){
        float metros, cm;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite os metros: ");
        metros = ler.nextFloat();
        cm = metros*100;
        
        System.out.println("\nCentímetros = "+cm+"cm");
     }
}
