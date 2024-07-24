package Aula03;

import java.util.Scanner;

public class Aula03Atividade12 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int codigo;
        
        System.out.print("Digite um código: ");
        codigo = ler.nextInt();
        
        switch (codigo){
            case 1->System.out.println("\nCaderno");
            case 2->System.out.println("\nLápis");
            case 3->System.out.println("\nBorracha");
            default->System.out.println("\nDiversos");
        }
    }
}
