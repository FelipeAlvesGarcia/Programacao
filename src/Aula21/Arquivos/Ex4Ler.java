package Aula21.Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex4Ler {
    public static void main(String[] args){
        File arquivo = new File("/home/felipe/pessoa.db");
        try{
            ObjectInputStream leitura = 
                    new ObjectInputStream(new FileInputStream(arquivo.getAbsoluteFile())); 
            Ex4 Pessoa = (Ex4) leitura.readObject();
            System.out.println(Pessoa.getNome()+"\n");
        }
        catch(ClassNotFoundException erro){
            System.out.println("Objeto não encontrado!");
        }
        catch(Exception erro){
            System.out.println("erro :(");
        }
                        
    }
}
