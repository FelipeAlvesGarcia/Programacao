package Aula17.FuncionarioExHeranca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Motorista m1 = new Motorista("anna", "Alves");
        System.out.println("Motorista: "+m1.getNome() +" "+ m1.getSobrenome()+"("+m1.getMat()+")");
        Engenheiro e1 = new Engenheiro("Felipe", "Garcia", 330749);
        System.out.println("Engenheiro: "+e1.getNome() +" "+ e1.getSobrenome()+"("+e1.getMat()+") - "+e1.getCrea());
    }
}
