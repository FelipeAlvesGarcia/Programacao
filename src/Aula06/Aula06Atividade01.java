package Aula06;

import java.util.Scanner;

public class Aula06Atividade01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[][] matrizD = new int[2][3];
        int i, n, j;
        boolean igual=false;
        
        for(i=0, j=1;i<matrizD.length;i++){
            for(n=0; n<matrizD[0].length; n++, j++){
                System.out.print("Digite o "+j+"º número: ");
                matrizD[i][n] = ler.nextInt();
            }
        }
        for(int[] linha:matrizD){
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }   
            System.out.println();
        }
        
        System.out.print("\nDigite um valor: ");
        int x = ler.nextInt();
        for(int[] l:matrizD){
            for(int c:l){
                if(c==x){
                    igual=true;
                }
            }
        }
        if(igual==true)
            System.out.println("\nEste valor existe na matriz!");
        else
            System.out.println("\nEste valor não existe na matriz!");
    }
}