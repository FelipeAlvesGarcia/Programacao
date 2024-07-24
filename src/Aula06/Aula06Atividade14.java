package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade14 {
    public static void main(String[] args){
        Random ale = new Random();
        int[][] nums = new int[10][10];
        int soma=0; 
        float media;
        
        for(int l=0; l<nums.length; l++){
            for(int c=0; c<nums[l].length; c++){
                nums[l][c] = ale.nextInt(1, 100);
                System.out.printf("%02d  ", nums[l][c]);
                if(l==c)
                    soma+=nums[l][c];
            }
            System.out.println();
        }
        
        media = (float) soma/nums.length;
        System.out.println("\nMédia = "+media);
    }
}
