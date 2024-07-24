package Aula03;

import java.util.Scanner;

public class Aula03Atividade10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        
        System.out.print("Digite sua primeira nota: ");
        nota1 = ler.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        nota2 = ler.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        nota3 = ler.nextFloat();
        
        media = (nota1+nota2+nota3)/3;
        if(nota1<0 || nota2<0 || nota3<0)
            System.out.println("\nNotas Inválidas!");
        else if(media>=7)
            System.out.println("\nAprovado!");
        else if(media<5)
            System.out.println("\nReprovado!");
        else
            System.out.println("\nEm Recuperação!");
    }
}