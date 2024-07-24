package Aula06;

import java.util.Scanner;
import java.util.Random;

public class Aula06Atividade11 {
    public static void main(String[] args) throws InterruptedException{
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        int[][] matriz = new int[4][4];
        char opcao;
        String visualMatriz = "";
        
        System.out.println("Defina os valores de uma matriz quadrada de ordem 4:");
        for(int l=0; l<matriz.length; l++){
            for(int c=0; c<matriz[l].length; c++){
                System.out.print(" - Digite o valor da posição ["+(l+1)+"] ["+(c+1)+"]: ");
                matriz[l][c] = ale.nextInt(1, 10);
                visualMatriz += String.format("%2d ", matriz[l][c]);
            }
            visualMatriz += String.format("\n");
        }
        
        int total;
        do{
            System.out.println("\n(a) Imprimir todos os elementos da matriz");
            System.out.println("(b) Somar os quadrados de todos os elementos da primeira coluna");
            System.out.println("(c) Somar todos os elementos da terceira linha");
            System.out.println("(d) Somar os elementos da diagonal principal");
            System.out.println("(e) Somar todos os elementos de índice par da segunda linha");
            System.out.println("(s) Sair");
            System.out.print("\nDigite sua opção: ");
            opcao = ler.next().toLowerCase().charAt(0);
            total=0;
            switch(opcao){
                case 'a'->System.out.printf("\n - (a):\n%s", visualMatriz); 
                case 'b'->{
                    for(int l=0; l<matriz.length; l++)
                        total += matriz[l][0] * matriz[l][0];
                    System.out.println("\n - (b): "+total);
                }
                case 'c'->{
                    for(int c=0; c<matriz[2].length; c++)
                        total += matriz[2][c];
                    System.out.println("\n - (c): "+total);
                }
                case 'd'->{
                    for(int l=0; l<matriz.length; l++){
                        for(int c=0; c<matriz[l].length; c++){
                            if(l==c)
                                total += matriz[l][c];
                        }
                    }
                    System.out.println("\n - (c): "+total);
                }
                case 'e'->{
                    for(int c=0; c<matriz[1].length; c++){
                        if(((c+1)%2)==0)
                            total += matriz[1][c];
                    }
                    System.out.println("\n - (c): "+total);
                }
                case 's'->System.out.println("\nSaindo...");
                default-> System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nErro... Está opção não existe!\n");
            }
            Thread.sleep(1000);
        }while(opcao!='s');
    }
}
