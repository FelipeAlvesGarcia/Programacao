package Aula13.Alunos;

public class Aluno {
    String nome;
    String sobrenome;
    String email;
    int codigo;
    float notaUm;
    float notaDois;
    
    float media;
    String estado;
    String obterMedia (){
        media = (notaUm + notaDois)/2;
        if(media >= 80){
            estado = "Aprovado";
        }
        else if(media >= 60){
            estado = "em Recuperação";
        }
        else{
            estado = "Reprovado";
        }
        return estado;
    }
}
