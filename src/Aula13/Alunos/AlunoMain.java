package Aula13.Alunos;

import Aula13.Alunos.Aluno;
import java.util.Random;
import java.util.Scanner;

public class AlunoMain {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        Aluno alunoUm = new Aluno();
        
        System.out.print("Digite o nome do aluno: ");
        alunoUm.nome = ler.next();
        System.out.print("Digite o sobrenome do aluno: ");
        alunoUm.sobrenome = ler.next();
        System.out.print("Digite o email do aluno: ");
        alunoUm.email = ler.next();
        alunoUm.codigo = new Random().nextInt(1000, 10000);
        System.out.print("Digite a primeira nota do aluno: ");
        alunoUm.notaUm = ler.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        alunoUm.notaDois = ler.nextFloat();
        
        System.out.println("\nO aluno está " + alunoUm.obterMedia());
    }
}