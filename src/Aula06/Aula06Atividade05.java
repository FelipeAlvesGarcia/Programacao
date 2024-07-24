package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade05 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        int[][] matrizA = new int[4][6];
        int[][] matrizB = new int[4][6];
        int[][] soma = new int[4][6];
        int[][] diferenca = new int[4][6];
        
        System.out.println("\tNa primeira matriz: ");
        for(int l=0; l<matrizA.length; l++){
            for(int c=0; c<matrizA[0].length; c++){
                System.out.print("Digite o elemento da "+(l+1)+"ª linha e "+(c+1)+"ª coluna: ");
                matrizA[l][c] = ler.nextInt();
                soma[l][c] += matrizA[l][c];
                diferenca[l][c] = -(diferenca[l][c] - matrizA[l][c]);
            }
        }
        System.out.println("\tNa segunda matriz: ");
        for(int l=0; l<matrizB.length; l++){
            for(int c=0; c<matrizB[0].length; c++){
                System.out.print("Digite o elemento da "+(l+1)+"ª linha e "+(c+1)+"ª coluna: ");
                matrizB[l][c] = ler.nextInt();
                soma[l][c] += matrizB[l][c];
                diferenca[l][c] -= matrizB[l][c];
            }
        }
        
        System.out.print("\n\nMatriz A: ");
        for(int[] linha:matrizA){
            System.out.println();
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }
        }
        System.out.print("\n\nMatriz B: ");
        for(int[] linha:matrizB){
            System.out.println();
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }
        }
        System.out.print("\n\nMatriz da soma da matriz A com B: ");
        for(int[] linha:soma){
            System.out.println();
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }
        }
        System.out.print("\n\nMatriz da diferença da matriz A com B: ");
        for(int[] linha:diferenca){
            System.out.println();
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }
        }
    }
}
