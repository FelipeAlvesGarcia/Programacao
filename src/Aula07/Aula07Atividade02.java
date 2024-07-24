package Aula07;

import java.util.Scanner;

public class Aula07Atividade02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int v1, v2, v3;
        
        System.out.print("Digite o 1º número: ");
        v1 = ler.nextInt();
        System.out.print("Digite o 2º número: ");
        v2 = ler.nextInt();
        System.out.print("Digite o 3º número: ");
        v3 = ler.nextInt();
        
        int menor = menor(v1, v2, v3);
        System.out.println("\nMenor número: "+menor);
    }
    
    public static int menor(int v1, int v2, int v3){
        if(v1<v2){
            if(v1<v3)
                return v1;
            else
                return v3;
        }
        else if(v2<v3)
            return v2;
        else
            return v3;
    }
}
