package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade08 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        int[][] matriz = new int[5][5];
        int somaDP=0;
        
        for(int l=0; l<matriz.length; l++){
            for(int c=0; c<matriz[0].length; c++){
                System.out.print("Digite o número ["+(l+1)+"] ["+(c+1)+"]: ");
                matriz[l][c] = ler.nextInt();
                if(l==c)
                    somaDP += matriz[l][c];
            }
        }
        
        System.out.println("\nMatriz:");
        for(int[] linha:matriz){
            for(int coluna:linha){
                System.out.printf("%02d ",coluna);
            }
            System.out.println();
        }
        System.out.println("Soma da Diagonal Principal = "+somaDP);
    }
}
