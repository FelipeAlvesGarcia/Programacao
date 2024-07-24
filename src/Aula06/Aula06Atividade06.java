package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        int[][] nums = new int[4][4], result = new int[4][4];
        int multi;
        
        System.out.print("Digite um número para ser multiplicado pela diagnal: ");
        multi = ler.nextInt();
        System.out.println("\n\t- Matriz:");
        for(int l=0; l<nums.length; l++){
            System.out.println();
            for(int c=0; c<nums[0].length; c++){
                System.out.print("Digite o múmero ["+(l+1)+"] ["+(c+1)+"]: ");
                nums[l][c] = ler.nextInt();
                if(l==c)
                    result[l][c] = nums[l][c] * multi;
                else
                    result[l][c] = nums[l][c];
            }
        }
        
        System.out.println("\n\n - Matriz: ");
        for(int[] linha:nums){
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }
            System.out.println();
        }
        System.out.println("\n - Matriz Resultante: ");
        for(int[] linha:result){
            for(int coluna:linha){
                System.out.print(coluna+" ");
            }
            System.out.println();
        }
    }
}
