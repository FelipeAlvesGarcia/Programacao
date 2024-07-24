package Aula05;

import java.util.Scanner;
import java.util.Random;

public class Aula05Exemplo01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] lista = new int[3];
        
        for(int i=0;i<lista.length;i++){
            System.out.print("Digite "+(i+1)+"º números: ");
            lista[i] = ler.nextInt();
        }
        for(int i=lista.length-1;i>=01;i--)
            System.out.print(lista[i]+" ");
        
        System.out.print("\n\n");
        int tamanho = lista.length;
        System.out.println("tamanho = "+tamanho+" \n");
        
        
        String[] nomes = {"ana", "felipe", "pedro"};
        int[] nums = {2, 4, 7};
        
        for(int valor:nums)
            System.out.print(valor+" ");
        System.out.print("\n");
        for(String valor:nomes)
            System.out.print(valor+" ");
        
        System.out.print("\n\n");
        String nome = "felipe";
        char[] nomeVetor = nome.toCharArray();
        for(char valor:nomeVetor)
            System.out.print(valor+" ");
        
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(10, 30);
    }
}