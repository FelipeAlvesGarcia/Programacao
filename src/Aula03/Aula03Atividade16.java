package Aula03;

import java.util.Scanner;

public class Aula03Atividade16 {
    public static void main(String[] args){
        int maximo, minimo, media, quantidade;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a quantidade em estoque: ");
        quantidade = ler.nextInt();
        System.out.print("Digite a quantidade máxima em estoque do mesmo: ");
        maximo = ler.nextInt();
        System.out.print("Digite a quantidade mínima em estoque do mesmo: ");
        minimo = ler.nextInt();
        
        media = (maximo + minimo)/2;
        System.out.println("\nMédia do estoque: "+media);
        if (quantidade >= media)
            System.out.println("Não efetuar compra!");
        else
            System.out.println("Efetuar a compra!");
    }
}