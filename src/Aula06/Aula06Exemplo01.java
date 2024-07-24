package Aula06;

import java.util.Scanner;

public class Aula06Exemplo01 {
    public static void main(String[] args){
        int[][] matriz = new int[4] [4];
        Scanner ler = new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("matriz ["+(i+1)+"] ["+(j+1)+"] = ");
                matriz[i][j] = ler.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.print("Diagonal: ");
        for(int i=0;i<4;i++)
            System.out.printf("%02d ", matriz[i][i]);
        System.out.println();
        System.out.print("Diagonal Sec: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if((i+j)==3){
                    System.out.printf("%02d ", matriz[i][j]);
                }
            }
        }
        System.out.println("\n");
        int[][] matrizB = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(matrizB[i][j]+" ");
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Número de linhas da mB = "+matrizB.length);
        System.out.println("Número de colunas da mB = "+matrizB[0].length);
        System.out.println("\n");
        for(int[] linha:matrizB){
            for(int coluna:linha)
                System.out.print(coluna+" ");
            System.out.println();
        }
    }
}
