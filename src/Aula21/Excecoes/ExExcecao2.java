package Aula21.Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExExcecao2 {
    public static void main(String[] args){
        boolean sair = true;
        Scanner ler = new Scanner(System.in);
        do{
            try{
                System.out.print("Digite um número: ");
                int n1 = ler.nextInt();
                System.out.print("Digite outro número: ");
                int n2 = ler.nextInt();
                System.out.println("Divisão: "+(n1/n2));    
                sair = true;
            }
            catch(InputMismatchException erro){ //precisa ser importado
                System.out.println("erro (Digite Números!)\n");
                ler.next(); //tirar buffer do teclado
                sair = false;
            }
            catch(ArithmeticException erro){
                System.out.println("erro (o número não pode ser divido por 0!)\n");
                ler.next(); //tirar buffer do teclado
                sair = false;
            }
            catch (Exception e){ //captura tudo (funciona também como default)
                System.out.println("Algo deu errado :(\n");
                e.printStackTrace(); //expressão do tratamento do java
                ler.next(); //tirar buffer do teclado
                sair = false;
            }
        }while(!sair);
    }
}
