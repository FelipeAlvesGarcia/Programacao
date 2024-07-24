package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade12 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        int[][] cartela = new int[5][5];
        boolean igual;
        String verCartela ="";
        
        for(int l=0; l<cartela.length; l++){
            verCartela += String.format("    ");
            for(int c=0; c<cartela[l].length ; c++){
                igual=true;
                for(; igual==true;){
                    igual = false;
                    cartela[l][c] = ale.nextInt(1, 100);
                    for(int ll=0; ll<l; ll++){
                        for(int cc=0; cc<c; cc++){
                            if(cartela[ll][cc]==cartela[l][c])
                                igual=true;
                        }
                    }
                }
                verCartela += String.format("%02d  ", cartela[l][c]);
            }
            verCartela += String.format("\n");
        }
        
        System.out.printf("----------CARTELA----------\n%s\n", verCartela);
    }
}