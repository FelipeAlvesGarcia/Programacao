package Aula13.Banco;

import java.util.Scanner;
import java.util.Random;

public class Banco {
    public static void main(String args[]){
        Conta[] lista = new Conta[100];
        int cont = 0;
        char opcao, opcao2;
        float valor;
        int id, n;
        String pSenha;
        boolean vConta;
        
        String senha, nome;
        
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        
        do{
            System.out.println("\n-------MENU-------");
            System.out.println("c - criar conta");
            System.out.println("l - listar contas");
            System.out.println("a - acessar conta");
            System.out.println("s - sair\n");
            System.out.print("Opção = ");
            opcao = ler.next().toLowerCase().charAt(0);
            
            if(opcao == 'c'){
                System.out.print("\nDigite o nome do titular: ");
                nome = ler.next();
                System.out.print("Didite uma senha: ");
                senha = ler.next();
                lista[cont] = new Conta(nome, senha, 100);
                System.out.println("Seu código/id = "+lista[cont].getId());
                cont++;
            }
            else if(opcao == 'l'){
                for(int i=0; i<cont; i++){
                    System.out.println("\nnome: "+lista[i].getTitular());
                    System.out.println("id: "+lista[i].getId());
                    System.out.println("senha: "+lista[i].getSenha());
                    System.out.println("saldo: R$"+lista[i].getSaldo());
                }
            }
            else if(opcao == 'a'){
                System.out.print("Digite o id: ");
                id = ler.nextInt();
                vConta = false;
                n=0;
                for(int i=0; i<cont; i++){
                    if(id == lista[i].getId()){
                        n = i;
                        vConta = true;
                    }
                }
                if(vConta == true){
                    System.out.print("Conta encontrada, digite sua senha: ");
                    pSenha = ler.next();
                    if(pSenha.equals(lista[n].getSenha())){
                        do{
                            System.out.println("\n-----MENU-----");
                            System.out.println("d - depositar");
                            System.out.println("s - sacar");
                            System.out.println("a - saldo");
                            System.out.println("e - sair\n");
                            System.out.print("Opção = ");
                            opcao2 = ler.next().toLowerCase().charAt(0);

                            if(opcao2 == 'd'){
                                System.out.print("Digite o valor que deseja depositar: ");
                                valor = ler.nextFloat();
                                lista[n].depositar(valor);
                            }
                            else if(opcao2 == 's'){
                                System.out.print("Digite o valor que deseja sacar: ");
                                valor = ler.nextFloat();
                                if(lista[n].sacar(valor) == true){
                                    System.out.println("Saque com sucesso!\n");
                                }
                                else{
                                    System.out.println("Não foi possível efetuar o saquen saque insuficiente!\n");
                                }
                            }
                            else if(opcao2 == 'a'){
                                System.out.println("Saldo = R$"+lista[n].getSaldo());
                            }
                            else if(opcao2 == 'e');
                            else{
                                System.out.println("Opção Inexistente!\n");
                            }
                        }while(opcao2 != 'e');
                    }
                    else{
                        System.out.println("Senha Incorreta!");
                    }
                }
                else{
                    System.out.println("Conta não encontrada!");
                }
            }
            else if(opcao == 's');
            else{System.out.print("\nOpção Inexistente!");}
        }while(opcao != 's');
    }
}
