package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade09 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        int[][] matriz = new int[5][5];
        int somaAC=0, somaAB=0;
        
        for(int l=0; l<matriz.length; l++){
            for(int c=0; c<matriz[0].length; c++){
                System.out.print("Digite o número ["+(l+1)+"] ["+(c+1)+"]: ");
                matriz[l][c] = ler.nextInt();
                if(l>c)
                    somaAB += matriz[l][c];
                else if(l<c)
                    somaAC += matriz[l][c];
            }
        }
        
        System.out.println("\nMatriz:");
        for(int[] linha:matriz){
            for(int coluna:linha){
                System.out.printf("%02d ",coluna);
            }
            System.out.println();
        }
        System.out.println("Soma abaixo da Diagonal Principal = "+somaAB);
        System.out.println("Soma acima da Diagonal Principal = "+somaAC);
    }
}
