package Aula03;

import java.util.Scanner;

public class Aula03Atividade13 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade;
        
        System.out.print("Digite a idade do conveniado: ");
        idade = ler.nextInt();  
        
        if (idade>=0 && idade < 10)
            System.out.println("\nValor a ser pago: "+(100+80));
        else if (idade <= 40)
            System.out.println("\nValor a ser pago: "+(100+50));
        else if (idade < 60)
            System.out.println("\nValor a ser pago: "+(100+95));
        else if (idade > 60)
            System.out.println("\nValor a ser pago: "+(100+130));
        else
            System.out.println("Idade Inválida!");
    }
}
