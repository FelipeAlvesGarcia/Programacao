package Aula21.Arquivos;

import java.io.File;

public class Ex3 {
    public static void main(String[] args){
        File caminho = new File("/home/felipe/arquivos");
        if(caminho.exists()){
            System.out.println("A pasta "+caminho.getAbsolutePath()+" existe");
        }
        else{
            System.out.println("A pasta "+caminho.getAbsolutePath()+" não existe");
            System.out.println("Criando pasta...");
            if(caminho.mkdirs()){
                System.out.println("[ok]");
            }
            else{
                System.out.println("[fail]");
            }
        }
    }
}
