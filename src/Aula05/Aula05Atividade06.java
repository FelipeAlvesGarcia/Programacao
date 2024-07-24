package Aula05;

import java.util.Scanner;

public class Aula05Atividade06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[10];
        String nome;
        
        for(int i=0;i<nomes.length;i++){
            System.out.print("Digite o "+(i+1)+"º nome: ");
            nomes[i] = ler.next();
        }
        System.out.print("\nDigite um nome: ");
        nome = ler.next();
        boolean achado = false;
        for(int i=0; i<nomes.length && achado!=true; i++){
            if(nome.equalsIgnoreCase(nomes[i])){
                System.out.println("\nACHEI!");
                achado=true;
            }
            else if(i==nomes.length-1)
                System.out.println("\nNÃO ACHEI!");
        }        
    }
}