package Aula04;

import java.util.Scanner;

public class Aula04Atividade15 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int mercadorias, quantidade, quantidadeTotal=0;
        float valor=1, media, total=0;
        
        for(mercadorias=0;mercadorias<1;){
            System.out.print("Digite quantos tipos de mercadorias diferentes existem em sua loja: ");
            mercadorias = ler.nextInt();
        }
        
        System.out.print("\n");
        for(int i=1;i<=mercadorias;i++){
            for(quantidade=0;quantidade<=0;){
                System.out.print("Digite a quantidade da "+i+"ª mercadoria: ");
                quantidade = ler.nextInt();
            }
            for(valor=0;valor<=0;){
                System.out.print("Digite o valor da "+i+"ª mercadoria: ");
                valor = ler.nextFloat();
            }
            quantidadeTotal += quantidade;
            total += (quantidade*valor);
        }
        media = total/quantidadeTotal;
        System.out.println("\nValor total em estoque = R$"+total);
        System.out.println("Média de valor das mercadorias = R$"+media);
    }
}
