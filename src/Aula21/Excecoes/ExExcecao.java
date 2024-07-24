package Aula21.Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExExcecao {
    public static void main(String[] args){
        try{
            Scanner ler = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int n1 = ler.nextInt();
            System.out.print("Digite outro número: ");
            int n2 = ler.nextInt();
            System.out.println("Divisão: "+(n1/n2));    
        }
        catch(InputMismatchException erro){
            System.out.println(erro); //mostra o erro
        }
        catch(ArithmeticException erro){
            System.out.println("erro (o número não pode ser divido por 0!)");
        }
        catch (Exception e){ //captura tudo (funciona também como default)
            System.out.print("Algo deu errado :(");
            e.printStackTrace(); //expressão do tratamento do java
        }
        finally{ //é executado sempre, sendo certo(try) ou erro(catch);
            System.out.println("\n\nHello World!");
        }
    }
}
