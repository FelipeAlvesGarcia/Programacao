package Aula04;

import java.util.Scanner;

public class Aula04Atividade16 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int quantidade, quantidadeTotal=0;
        float valor=1, media, total=0;
        char opcao;
        
        do{
            System.out.print("\n");
            for(quantidade=0;quantidade<=0;){
                System.out.print("Digite a quantidade da mercadoria: ");
                quantidade = ler.nextInt();
            }
            for(valor=0;valor<=0;){
                System.out.print("Digite o valor da mercadoria: ");
                valor = ler.nextFloat();
            }
            quantidadeTotal += quantidade;
            total += (quantidade*valor);
            for(opcao='d';opcao!='n' && opcao!='s';){
                System.out.print("MAIS MERCADORIAS (S/N): ");
                opcao = ler.next().toLowerCase().charAt(0);    
            }
            
        }
        while(opcao!='n');
        media = total/quantidadeTotal;
        System.out.println("\nValor total em estoque = R$"+total);
        System.out.println("Média de valor das mercadorias = R$"+media);
    }
}
