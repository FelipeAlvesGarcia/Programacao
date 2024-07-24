package Aula02;

import java.util.Scanner;

public class Aula02Atividade15 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float comprimento, kml;
        int voltas, reabastecimentos;
        
        System.out.print("Digite o comprimento da pista: ");
        comprimento = ler.nextFloat();
        System.out.print("Digite quantos KM/L o carro faz: ");
        kml = ler.nextFloat();
        System.out.print("Digite o número de voltas da corrida: ");
        voltas = ler.nextInt();
        System.out.print("Digite o número de reabastecimentos desejados: ");
        reabastecimentos = ler.nextInt();
        
        int razao, resto;
        float litros;
        if(reabastecimentos == 1){
            resto = voltas%2;
            if(resto==0){
                litros = ((voltas/2)*comprimento)/kml;
                System.out.println("\nNúmero mínimo de litros para o próximo reabastecimento: "+litros+" litros");
            }
            else{
                razao = voltas/2+1;
                litros = (razao*comprimento)/kml;
                System.out.println("\nNúmero mínimo de litros para o próximo reabastecimento: "+litros+" litros");
            }
        }
        else{
            razao = voltas / reabastecimentos;
            litros = (razao*comprimento)/kml;
            resto = voltas/reabastecimentos;
            if(resto==0){
                System.out.println("\nNúmero mínimo de litros para o próximo reabastecimento: "+litros+" litros");
            }
            else{
                System.out.println("\nNúmero mínimo de litros para o próximo reabastecimento: "+litros+" litros");
                float excecao = ((resto*100/razao)*comprimento/kml)/100;
                System.out.println("COM EXCEÇÃO DO ULTIMO REABASTECIMENTO, QUE PRECISARÁ SOMENTE DE: "+excecao+" litros");
            }
        }
        System.out.println();
    }
}