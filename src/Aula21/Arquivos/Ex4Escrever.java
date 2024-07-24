package Aula21.Arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex4Escrever {
    public static void main(String[] args){
        File arquivo = new File("/home/felipe/pessoa.db");
        try{
            ObjectOutputStream escrita = 
                    new ObjectOutputStream(new FileOutputStream(arquivo.getAbsoluteFile())); 
            //criando o objeto
            Ex4 p1 = new Ex4();
            p1.setNome("Felipe");
            p1.setSobrenome("Garcia");
            //p1.setCpf(05739473645);
            //Escreve o objeto no arquivo
            escrita.writeObject(p1);
            System.out.println("Pessoa "+p1.getNome()+" salva com sucesso!");
            escrita.close();
        }
        catch(Exception erro){
            System.out.println("erro :(");
        }
                        
    }
}
