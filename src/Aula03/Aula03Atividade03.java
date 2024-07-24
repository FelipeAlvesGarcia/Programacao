package Aula03;

import java.util.Scanner;

public class Aula03Atividade03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senha = "12345678", entrada;
        System.out.print("Digite a senha: ");
        entrada = ler.nextLine();
        if (entrada.equals(senha)) {
            System.out.println("Acesso Autorizado");
        } else {
            System.out.println("Acesso Negado");
        }
    }
}
