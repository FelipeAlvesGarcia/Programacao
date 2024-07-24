package Aula03;

import java.util.Scanner;

public class Aula03Exemplo03 {
    public static void main(String[] arg){
        Scanner ler = new Scanner(System.in);
        int dia;
        
        System.out.print("Digite o dia da semana: ");
        dia = ler.nextInt();
        
        switch (dia){
            //case "admin"->;         STRING
            case 1, 7-> System.out.println("É final de semana");
            case 2,3,4,5,6-> System.out.println("É dia de semana");
            default->{
                System.out.println("INVÁLIDO");
            }
        }
    }
}
