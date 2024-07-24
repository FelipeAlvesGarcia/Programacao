package Aula02;

import java.util.Scanner;

public class Aula02Atividade03 {
    public static void main(String[] args){
        float nota1, nota2, nota3, nota4;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite Sua 1° nota: ");
        nota1 = ler.nextFloat();
        System.out.print("Digite Sua 2° nota: ");
        nota2 = ler.nextFloat();
        System.out.print("Digite Sua 3° nota: ");
        nota3 = ler.nextFloat();
        System.out.print("Digite Sua 4° nota: ");
        nota4 = ler.nextFloat();
        
        float media = (float) (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("\nSua média = "+media);
    }
}
