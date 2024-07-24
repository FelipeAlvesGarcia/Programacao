package Aula06;

import java.util.Scanner;

public class Aula06Atividade03 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[][] soma = new int[4][4];
        int total=0, linha3=0, coluna2=0;
        
        for(int l=0, i=1; l<soma.length; l++){
            for(int c=0; c<soma[0].length; c++, i++){
                System.out.print("Digite "+i+"º número: ");
                soma[l][c] = ler.nextInt();
                total += soma[l][c];
                if(l==3-1)
                    linha3 += soma[l][c];
                if(c==2-1)
                    coluna2 += soma[l][c];
            }
        }
        
        for(int[] linha:soma){
            System.out.println();
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }
        }
        System.out.println("\n\nSoma da linha 3 = "+linha3);
        System.out.println("Soma da coluna 2 = "+coluna2);
        System.out.println("Soma de todos os elementos = "+ total);
    }
}