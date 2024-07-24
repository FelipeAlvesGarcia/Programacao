package Aula17.Banco2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Random;

public class Banco2 {
    public static void main(String[] args){
        File arquivoCC = new File("/home/felipe/bancoCC.db");
        File arquivoCP = new File("/home/felipe/bancoCP.db");
        CC[] listaC = new CC[100];
        CP[] listaP = new CP[100];
        int nContasCC = 0;
        int nContasCP = 0;
        
        try{
            ObjectInputStream lerCC = new ObjectInputStream(new FileInputStream(arquivoCC.getAbsoluteFile()));
            listaC = (CC[]) lerCC.readObject();
            while(listaC[nContasCC] != null){
                nContasCC++;
            }
        }
        catch(FileNotFoundException erro){
            System.out.println("\nArquivo não encontrado!\n");
        }
        catch(ClassNotFoundException erro){
            System.out.println("\nObjeto não encontrado!\n");
        }
        catch(IOException erro){
            System.out.println("\nErro de entrada e saida!\n");
        }
        catch(Exception erro){
            System.out.println("\nErro!\n");
        }
        try{
            ObjectInputStream lerCP = new ObjectInputStream(new FileInputStream(arquivoCP.getAbsoluteFile()));
            listaP = (CP[]) lerCP.readObject();
            while(listaP[nContasCP] != null){
                nContasCP++;
            }
        }
        catch(FileNotFoundException erro){
            System.out.println("\nArquivo não encontrado!\n");
        }
        catch(ClassNotFoundException erro){
            System.out.println("\nObjeto não encontrado!\n");
        }
        catch(IOException erro){
            System.out.println("\nErro de entrada e saida!\n");
        }
        catch(Exception erro){
            System.out.println("\nErro!\n");
        }  
        
        int cont = nContasCC;
        char opcao, opcao2;
        float valor;
        int n;
        String id;
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
                listaC[cont] = new CC(nome, senha, 100, 500);
                System.out.println("Seu código/id Corrente = "+listaC[cont].getId());
                listaP[cont] = new CP(nome, senha, 100);
                System.out.println("Seu código/id Poupança = "+listaP[cont].getId());
                cont++;
            }
            else if(opcao == 'l'){
                for(int i=0; i<cont; i++){
                    System.out.println("\nnome: "+listaC[i].getTitular());
                    System.out.println("id Puopança: "+listaP[i].getId());
                    System.out.println("id Corrente: "+listaC[i].getId());
                    System.out.println("senha: "+listaC[i].getSenha());
                    System.out.println("saldo Poupança: R$"+listaP[i].getSaldo());
                    System.out.println("saldo Poupança: R$"+listaC[i].getSaldo());
                    System.out.println("limite da conta corrente: R$"+listaC[i].getLimite());
                }
            }
            else if(opcao == 'a'){
                System.out.print("Digite o id: ");
                id = ler.next();
                vConta = false;
                n=0;
                for(int i=0; i<cont; i++){
                    if(id.equals(listaC[i].getId())){
                        n = i;
                        vConta = true;
                    }
                    if(vConta == true){
                        System.out.print("Conta encontrada, digite sua senha: ");
                        pSenha = ler.next();
                        if(pSenha.equals(listaC[n].getSenha())){
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
                                    listaC[n].depositar(valor);
                                }
                                else if(opcao2 == 's'){
                                    System.out.print("Digite o valor que deseja sacar: ");
                                    valor = ler.nextFloat();
                                    if(listaC[n].sacar(valor) == true){
                                        System.out.println("Saque com sucesso!\n");
                                    }
                                    else{
                                        System.out.println("Não foi possível efetuar o saque, saque insuficiente!\n");
                                    }
                                }
                                else if(opcao2 == 'a'){
                                    System.out.println("Saldo = R$"+listaC[n].getSaldo()+" (R$"+listaC[n].getLimite()+" limite)");
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
                    
                    else if(id.equals(listaP[i].getId())){
                        n = i;
                        vConta = true;
                    }
                    if(vConta == true){
                        System.out.print("Conta encontrada, digite sua senha: ");
                        pSenha = ler.next();
                        if(pSenha.equals(listaP[n].getSenha())){
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
                                    listaP[n].depositar(valor);
                                }
                                else if(opcao2 == 's'){
                                    System.out.print("Digite o valor que deseja sacar: ");
                                    valor = ler.nextFloat();
                                    if(listaP[n].sacar(valor) == true){
                                        System.out.println("Saque com sucesso!\n");
                                    }
                                    else{
                                        System.out.println("Não foi possível efetuar o saque, saque insuficiente!\n");
                                    }
                                }
                                else if(opcao2 == 'a'){
                                    System.out.println("Saldo = R$"+listaP[n].getSaldo());
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
                }
                if(!vConta){
                    System.out.println("Conta não encontrada!");
                }
            }
            else if(opcao == 's'){
                try{
                    ObjectOutputStream escritaCC = new ObjectOutputStream(new FileOutputStream(arquivoCC.getAbsoluteFile()));
                    ObjectOutputStream escritaCP = new ObjectOutputStream(new FileOutputStream(arquivoCP.getAbsoluteFile()));
                    for(int i=0; i<listaC.length; i++){
                        escritaCC.writeObject(listaC);    
                    }
                    for(int i=0; i<listaP.length; i++){
                        escritaCP.writeObject(listaP);    
                    }
                    escritaCC.close();
                    escritaCP.close();
                }
                catch(Exception erro){
                    System.out.println("\nNão foi possível\n");
                }
            }
            else{System.out.print("\nOpção Inexistente!");}
        }while(opcao != 's');
    }
}