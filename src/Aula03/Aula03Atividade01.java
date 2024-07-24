package Aula03;

import java.util.Scanner;

public class Aula03Atividade01 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String mes;
        System.out.print("Digite o mes: ");
        mes = ler.next().toLowerCase();//Tudo minúsculo OU toUpperCase() - Maiúsculo
        //char mes = ler.next().charAT(x) --Pegar caractere
        switch(mes){
            case "janeiro"-> System.out.println("\n1");
            case "fevereiro"->System.out.println("\n2");
            case "março"->System.out.println("\n3");
            case "abril"->System.out.println("\n4");
            case "maio"->System.out.println("\n5");
            case "junho"->System.out.println("\n6");
            case "julho"->System.out.println("\n7");
            case "agosto"->System.out.println("\n8");
            case "setembro"->System.out.println("\n9");
            case "outubro"->System.out.println("\n10");
            case "novembro"->System.out.println("\n11");
            case "dezembro"->System.out.println("\n12");
            default->System.out.println("Mes Invalido!");
        }
    }
}
