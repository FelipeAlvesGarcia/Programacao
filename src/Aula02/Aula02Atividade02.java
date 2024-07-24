package Aula02;

import java.util.Scanner;

public class Aula02Atividade02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nome;
        String sobrenome;
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.println("\nBem-Vindo "+nome+" "+sobrenome);
    }
}
