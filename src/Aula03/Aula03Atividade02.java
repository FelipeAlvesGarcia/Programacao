package Aula03;

import java.util.Scanner;
//5 7; 8 10; 11 13; 14 17; 18

public class Aula03Atividade02 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        
        if (idade <= 0)
            System.out.println("Idade Inválida");
        else if (idade > 0 && idade < 5)
            System.out.println("Você émuito novo!");
        else if (idade < 8)
            System.out.println(nome+" - Categoria INFANTIL A");
        else if (idade < 11)
            System.out.println(nome+" - Categoria INFANTIL B");
        else if (idade < 14)
            System.out.println(nome+" - Categoria JUVENIL A");
        else if (idade < 18)
            System.out.println(nome+" - Categoria JUVENIL B");
        else if (idade >= 18)
            System.out.println(nome+" - Categoria ADULTO");
    }
}
