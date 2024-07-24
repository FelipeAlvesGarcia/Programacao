package Aula05;

import java.util.Scanner;

public class Aula05Atividade10 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] vetorX = new int[10], vetorY = new int[10], vetorR = new int[20];
        int i, n;
        
        for(i=0; i<vetorX.length; i++){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetorX[i] = ler.nextInt();
        }
        System.out.print("\n");
        for(i=0; i<vetorY.length; i++){
            System.out.print("Digite o "+(i+1)+"º número: ");
            vetorY[i] = ler.nextInt();
        }
        
        for(i=0, n=0; i<vetorR.length; i++, n++){
            vetorR[i] = vetorX[n];
            i++;
            vetorR[i] = vetorY[n];
        }
        System.out.println();
        for(int valor:vetorR)
            System.out.print(valor+" ");
    }
}
