package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade13 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        System.out.println("Em relação a uma matriz: ");
        System.out.print(" - Digite a quantidade de linhas: ");
        int linhas = ler.nextInt();
        System.out.print(" - Digite a quantidade de colunas: ");
        int colunas = ler.nextInt();
        int[][] matrizB = new int[linhas][colunas];
        int maior=0, soma, linhaMaior=0;
        
        System.out.println(" - Seus valores:");
        for(int l=0; l<matrizB.length; l++){
            for(int c=0; c<matrizB[l].length; c++){
                System.out.print("   - Digite o valor do elemento ["+(l+1)+"] ["+(c+1)+"]: ");
                matrizB[l][c] = ler.nextInt();
            }
        } 
        
        for(int l=0; l<matrizB.length; l++){
            soma=0;
            for(int c=0; c<matrizB[l].length; c++)
                soma+=matrizB[l][c];
            if(soma>maior){
                maior=soma;
                linhaMaior=l+1;
            }
        }
        
        System.out.println("\nLinha de maior soma da matriz: "+linhaMaior+" = "+maior);
    }
}
