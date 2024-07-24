package Aula03;

import java.util.Scanner;

public class Aula03Atividade18 {
    public static void main(String[] args){
        float saldo, saldoAtual, debito, credito;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu saldo: ");
        saldo = ler.nextFloat();
        System.out.print("Digite seu débito: ");
        debito = ler.nextFloat();
        System.out.print("Digite seu crédito: ");
        credito = ler.nextFloat();
        
        saldoAtual = saldo - debito + credito;
        System.out.println("\nSaldo Atual = "+saldoAtual);
        if(saldoAtual < 0)
            System.out.println("Saldo Negativo");
        else
            System.out.println("Saldo Positivo");
    }
}