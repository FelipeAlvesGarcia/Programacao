package Aula21.Polimorfismo;

public class ExOverride2 {
    public static void main(String[] args){
        ExOverrideAluno a1 = new ExOverrideAluno("Felipe", "Garcia", 17, 375); 
        System.out.println(a1+"\n"); //ver o toString no ExOverrideAluno
        
        ExOverride p1 = new ExOverride("Felipe", "Garcia", 17);
        System.out.println(p1); // sem modificar o toString
    }
}
