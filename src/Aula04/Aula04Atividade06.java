package Aula04;

import java.util.Scanner;

public class Aula04Atividade06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        float nota, total=0, media;
        char opcao;
        
        do{
            total = 0;
            for(int i=1;i<=3;i++){
                for(nota=-1;nota<0 || nota>10;){
                    System.out.print("Digite a nota da "+i+"º nota: ");
                    nota = ler.nextFloat();
                }
                total += nota;
            }
            media = total /3;
            System.out.println("\nA média do aluno é: "+media);
            for(opcao='i';opcao != 's' && opcao != 'n';){
                System.out.print("\nDeseja calcular a media de outro aluno?\n(s)sim\n(n)não\nResposta: ");
                opcao = ler.next().toLowerCase().charAt(0);
            }
        }
        while(opcao == 's');
    }
}