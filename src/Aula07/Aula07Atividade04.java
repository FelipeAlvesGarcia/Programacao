package Aula07;

import java.util.Random;

public class Aula07Atividade04 {
    public static void main(String[] args){
        int[] cont = new int[6];
        int num = dado(cont);
        System.out.println("Ultimo número sortiado: "+num+"\n");
        for(int i=0; i<cont.length; i++)
            System.out.println(" - "+(i+1)+" - caiu: "+cont[i]+" vezes");
    }
    
    public static int dado(int[] cont){
        Random ale = new Random();
        int num=0;
        for(int i=0; i<1000000; i++){
            num = ale.nextInt(1, 7);
            cont[num-1] += 1;
        }
        return num;
    }
}
