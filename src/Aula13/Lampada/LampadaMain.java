package Aula13.Lampada;

import Aula13.Lampada.Lampada;
import java.util.Scanner;

public class LampadaMain {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Lampada lamUm = new Lampada(); 
        boolean estado;

        System.out.print("Digite a marca da lâmpada: ");
        lamUm.marca = ler.nextLine();
        System.out.print("Digite a modelo da lâmpada: ");
        lamUm.modelo = ler.nextLine();
        System.out.print("Digite a cor da lâmpada: ");
        lamUm.cor = ler.nextLine();
        System.out.print("Digite a local da lâmpada: ");
        lamUm.local = ler.nextLine();
        
        System.out.println("\n"+lamUm.informacoes());
        char opcao;
        do{
            System.out.println("\n(I) Informações");
            System.out.println("\n(L) Ligar");
            System.out.println("\n(D) Desligar");
            System.out.println("\n(E) Estado da Lâmpada");
            System.out.println("\n(S) Sair");
            System.out.print("\nDigite sua opção: ");
            opcao = ler.next().toLowerCase().charAt(0);
            System.out.println();
            
            switch(opcao){
                case 'i'->{
                    System.out.println(lamUm.informacoes());
                }
                case 'l'->{
                    lamUm.ligar();
                }
                case 'd'->{
                    lamUm.desligar();
                }
                case 'e'->{
                    estado = lamUm.estaLigada();
                    if(estado){
                        System.out.println("Lampada está ligada!");
                    }
                    else{
                        System.out.println("Lampada está desligada!");
                    }
                }
                case 's'->{
                   
                }
                default->{
                    System.out.println("\nOpção Incorreta!\n");
                }
            }

        }while(opcao!='s');
    }
}
