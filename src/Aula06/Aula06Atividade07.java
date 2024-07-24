package Aula06;

import java.util.Random;

public class Aula06Atividade07 {
    public static void main(String[] args){
        Random ale = new Random();
        int[][] matrizA = new int[10][10];
        int[] diagonalP = new int[10];
        
        for(int l=0; l<matrizA.length; l++){
            for(int c=0; c<matrizA[0].length; c++){
                matrizA[l][c] = ale.nextInt(1, 21);
                if(l==c)
                    diagonalP[l] = matrizA[l][c];
                System.out.printf("%2d ",matrizA[l][c]);
            }
            System.out.println();
        }
        
        System.out.print("\nDiagonal de uma matriz 10x10 aleatória:");
        for(int valor:diagonalP)
            System.out.print(" "+valor);
        System.out.println();
    }
}
