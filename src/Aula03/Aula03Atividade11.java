package Aula03;

import java.util.Scanner;

public class Aula03Atividade11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade1, idade2;
        String nome1, nome2;
        
        System.out.print("Digite o primeiro nome: ");
        nome1 = ler.nextLine();
        System.out.print("Digite a idade de "+nome1+": ");
        idade1 = ler.nextInt();
        System.out.print("Digite o segundo nome: ");
        nome2 = new Scanner(System.in).nextLine();
        System.out.print("Digite a idade de "+nome2+": ");
        idade2 = ler.nextInt();
        
        if(idade1 > idade2)
            System.out.println("\nMais Velho: "+nome1+" ("+idade1+")\nMais Novo: "+nome2+" ("+idade2+" anos)");
        else if(idade2 > idade1)
            System.out.println("\nMais Velho: "+nome2+" ("+idade2+")\nMais Novo: "+nome1+" ("+idade1+" anos)");
        else
            System.out.println("\nOs dois têm a mesma idade");
    }
}
