package Aula06;

import java.util.Scanner;

public class Aula06Atividade04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[][] matrizG = new int[3][3];
        int[] sc = new int[3], sl = new int[3];
        
        for(int l=0; l<matrizG.length; l++){
            for(int c=0; c<matrizG[0].length; c++){
                System.out.print("Digite o elemento da "+(l+1)+"ª linha e "+(c+1)+"ª coluna: ");
                matrizG[l][c] = ler.nextInt();
                sc[c] += matrizG[l][c];
                sl[l] += matrizG[l][c]; 
            }
        }
        
        for(int[] linha:matrizG){
            System.out.println();
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }
        }
        System.out.print("\n\nSoma das colunas = ");
        for(int valor:sc){
            System.out.print(valor+" ");
        }
        System.out.print("\n\nSoma das linhas = ");
        for(int valor:sl){
            System.out.print(valor+" ");
        }
        System.out.println();
    }
}