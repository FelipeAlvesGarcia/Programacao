package Aula04;

import java.util.Scanner;

public class Aula04Atividade04 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade;
        
        do{
            System.out.print("Digite a idade: ");
            idade = ler.nextInt();
        }
        while(idade>150 || idade<0);
        System.out.println("\nSua idade: "+idade+" anos");
    }
}
