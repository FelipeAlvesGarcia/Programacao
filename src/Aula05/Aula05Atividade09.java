package Aula05;

import java.util.Scanner;

public class Aula05Atividade09 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] vetorR = new int[5], vetorS = new int[10], vetorX = new int[15];
        int n=0;
        
        for(int i=0; i<vetorR.length; i++, n++){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetorR[i] = ler.nextInt();
            vetorX[n] = vetorR[i];
        }
        System.out.println();
        for(int i=0; i<vetorS.length; i++, n++){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetorS[i] = ler.nextInt();
            vetorX[n] = vetorS[i];
        }
        
        System.out.print("\n");
        for(int valor:vetorX)
            System.out.print(valor+" ");
    }
}
