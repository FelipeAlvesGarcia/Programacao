package Aula05;

import java.util.Scanner;

public class Aula05Atividade11 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int tamanho = 10;
        int[] nums = new int[tamanho];
        int i, n, opcao;
        boolean sair = false;
        
        for(i=0 ; i<nums.length; i++){
            System.out.print("Digite o "+(i+1)+"º número: ");
            nums[i] = ler.nextInt();
        }
        do{
            if(tamanho==0)
                sair=true;
            else{
                System.out.print("\nEscolha um número para excluir -> ");
                for(i=0; i<tamanho; i++)
                    System.out.print(nums[i]+" ");
                System.out.println();
                opcao = ler.nextInt();
                for(i=0; i<tamanho; i++){
                    if(nums[i]==opcao){
                       sair = false; 
                       break;
                    } 
                    else
                        sair = true;
                }
                if(sair==false){
                    for(n=i; n<tamanho-1; n++)
                        nums[n] = nums[n+1];
                    tamanho -= 1;
                }
            }
        }while(sair!=true);
    }
}