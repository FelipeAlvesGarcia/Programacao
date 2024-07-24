package Aula02;

import java.util.Scanner;

public class Aula02Atividade14 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float litro = (float) 4.15;
        float kmInicio, kmFinal, litros, dinheiro;
        float combustivel, kml, lucro;
        
        System.out.print("Digite a quilometragem no início do dia: ");
        kmInicio = ler.nextFloat();
        System.out.print("Digite a quilometragem no final do dia: ");
        kmFinal = ler.nextFloat();
        System.out.print("Digite a quantidade de litros de combustível gastos no dia: ");
        litros = ler.nextFloat();
        System.out.print("Digite a quantidade total de dinheiro recebido por dia: ");
        dinheiro = ler.nextFloat();
        
        kml = (kmFinal - kmInicio)/litros;
        combustivel = litros*litro;
        lucro = dinheiro - combustivel;
        System.out.println("\nKM/Litro = "+kml);
        System.out.println("Lucro no dia = R$"+lucro);
    }
}