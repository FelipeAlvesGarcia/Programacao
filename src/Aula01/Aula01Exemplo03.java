package Aula01;

import java.util.Scanner;

public class Aula01Exemplo03 {
    public static void main(String[] args){
        //new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("Seu número: "+numero);
        
        System.out.println("Digite seu nome");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Bem-Vindo "+nome);
    }  
}
