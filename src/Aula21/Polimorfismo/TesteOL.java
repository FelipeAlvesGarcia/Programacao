package Aula21.Polimorfismo;

public class TesteOL {
    public static void main(String[] args){
        ExOverload op = new ExOverload();
        System.out.println("Somando dois nums: "+op.soma(1,2));
        System.out.println("Somando três nums: "+op.soma(1,2,3));
        System.out.println("Concatenando duas Strings: "+op.soma("oi ","mundo!"));
    }
}
