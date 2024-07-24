package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        int[][] nums = new int[5][5];
        int x, l, c;
        boolean igual = false;
        
        for(l=0; l<nums.length; l++){
            for(c=0; c<nums[l].length; c++){
                System.out.print("Digite o número da posição ["+(l+1)+"] ["+(c+1)+"]: ");
                nums[l][c] = ler.nextInt();
            }
        }
        System.out.print("\nDigite um valor para verificar se está na matriz: ");
        x = ler.nextInt();
        
        for(int[] linha:nums){
            for(int coluna:linha){
                System.out.printf("%2d ", coluna);
            }
            System.out.println();
        }
        
        for(l=0; l<nums.length; l++){
            for(c=0; c<nums[0].length; c++){
                if(x==nums[l][c]){
                    System.out.print("\nEste valor está localizado na posição: ["+(l+1)+"] ["+(c+1)+"]");
                    igual=true;
                }
            }
        }
        System.out.println();
        if(igual==false)
            System.out.println("Este valor não está localizado na matriz!");
    }
}
